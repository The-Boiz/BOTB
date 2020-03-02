package com.example.botb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BoxFragment.OnListFragmentInteractionListener {
    EditText searchBar;
    DummyBoxDatabase db;
    BoxFragment boxFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchBar = findViewById(R.id.searchBar);
        boxFragment = (BoxFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
            searchBar.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }

                @Override
                public void afterTextChanged(Editable s) {
                    filter(s.toString());
                }
            });
        }

    @Override
    public void onListFragmentInteraction(Box item) {
            Intent intent = new Intent(this, ImageActivity.class);
            intent.putExtra("Image", item.getImageID());
            startActivity(intent);
    }
    private void filter(String text) {
        db = new DummyBoxDatabase();
        List<Box> filteredList = new ArrayList<>();
        for (int i = 0; i < db.getList().size() - 1 ; i++) {
            if (db.getList().get(i).getBrand().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(db.getList().get(i));
            }
            else if(db.getList().get(i).getName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(db.getList().get(i));
            }
        }
        boxFragment.getAdapter().filterList(filteredList);
    }




}
