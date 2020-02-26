package com.example.botb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

public class MainActivity extends AppCompatActivity implements BoxFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(Box item) {
        BoxFragment boxFragment = (BoxFragment) getSupportFragmentManager().findFragmentById(R.id.);
        if(boxFragment != null && boxFragment.isInLayout()) {
            boxFragment.setBrandText(item.getBrand());
            boxFragment.setNameText(item.getName());
            boxFragment.setImage(item.getImageID());
        }

        else{
            Intent intent = new Intent(this, ImageActivity.class);
            intent.putExtra("Image", item.getImageID());
            startActivity(intent);
        }
    }
}
