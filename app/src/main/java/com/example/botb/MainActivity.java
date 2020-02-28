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
    private EditText searchBar;
    private MyBoxRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchBar = findViewById(R.id.searchBar);
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filter(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void filter(String text) {
        DummyBoxDatabase db = new DummyBoxDatabase();
        List<Box> filteredBox = new ArrayList<>();
        adapter = new MyBoxRecyclerViewAdapter(db.getList(),null);
        for (int i = 0; i < db.getList().size() - 1 ; i++) {
            if (db.getList().get(i).getBrand().toLowerCase().contains(text.toLowerCase())) {
                filteredBox.add(db.getList().get(i));
            }
        }
        adapter.filterList(filteredBox);
    }
    @Override
    public void onListFragmentInteraction(Box item) {
        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("Image", item.getImageID());
        startActivity(intent);
    }
}
