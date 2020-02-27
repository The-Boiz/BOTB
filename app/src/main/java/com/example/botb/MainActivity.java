package com.example.botb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.EditText;

import java.io.ByteArrayOutputStream;


public class MainActivity extends AppCompatActivity implements BoxFragment.OnListFragmentInteractionListener {
    private EditText searchBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchBar = findViewById(R.id.searchBar);
    }

    @Override
    public void onListFragmentInteraction(Box item) {
        BoxFragment boxFragment = (BoxFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        if(boxFragment != null && boxFragment.isInLayout()) {

        }
            Intent intent = new Intent(this, ImageActivity.class);
            intent.putExtra("Image", item.getImageID());
            startActivity(intent);
    }
}
