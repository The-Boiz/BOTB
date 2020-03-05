package com.example.botb;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class UserVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_verification);
        EditText username = findViewById(R.id.editText3);
        EditText password = findViewById(R.id.editText4);
        Button signIn = findViewById(R.id.signInButton);
        Button signUp = findViewById(R.id.signUpButton);
        

    }






}
