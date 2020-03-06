package com.example.botb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class UserVerificationActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button signIn;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_verification);
         username = findViewById(R.id.editText3);
         password = findViewById(R.id.editText4);
         signIn = findViewById(R.id.signInButton);
         signUp = findViewById(R.id.signUpButton);



    }

    public void signUpIntent(View v){
        Intent intent = new Intent(this,SignUpActivity.class);
        intent.putExtra("username",);
        intent.putExtra("password", );
        startActivity(intent);

    }

}
