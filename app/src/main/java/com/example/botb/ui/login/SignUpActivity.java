package com.example.botb.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.botb.R;
import com.example.botb.data.LoginDataSource;

public class SignUpActivity extends AppCompatActivity {
    Button signupButton;
    EditText email;
    EditText password;
    LoginDataSource test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getIntent();
        /*
        if(email.getText() != null) {
            if(password.getText() != null) {
                signupButton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        test = new LoginDataSource();
                        email.getText();
                        password.getText();
                        finish();
                    }

                });

            }
            else {
                Toast.makeText(getApplicationContext(),"Input Password" ,Toast.LENGTH_LONG).show();
            }

        }
        else {
            Toast.makeText(getApplicationContext(),"Input Email address" ,Toast.LENGTH_LONG).show();

        }

         */
    }



}
