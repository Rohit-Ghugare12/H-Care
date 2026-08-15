package com.example.hcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Login_activity extends AppCompatActivity {

    TextView tvForgetPassword,tvRegisterhere;
    AppCompatButton btnLogin;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvForgetPassword = findViewById(R.id.tvForgetPassword);
        tvRegisterhere = findViewById(R.id.tvRegisterhere);
        btnLogin = findViewById(R.id.btnLogin);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        tvRegisterhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login_activity.this,Registration_page.class);
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().isEmpty())
                {
                    etUsername.setError("Enter Username");
                }
                else if (etPassword.getText().toString().isEmpty()) {

                    etPassword.setError( "Enter Password");
                } else if ( etPassword.getText().toString().length()<=8)
                {
                    etPassword.setError( " Password length must be greater than 8");

                } else if (!etPassword.getText().toString().matches(".*[A-Z].*")) {

                    etPassword.setError(  "Password matches 1 Number,1 Symbol,1 Upper case latter,1 Lower case letter");
                } else if (!etPassword.getText().toString().matches(".*[@,#,$,%,!,*,&,~,%].*")) {

                    etPassword.setError(  "Password matches 1 Number,1 Symbol,1 Upper case latter,1 Lower case letter");
                } else if (!etPassword.getText().toString().matches(".*[0-9].*")) {
                    etPassword.setError(  "Password matches 1 Number,1 Symbol,1 Upper case latter,1 Lower case letter");
                }else if (!etPassword.getText().toString().matches(".*[a-z].*"))
                {
                    etPassword.setError(  "Password matches 1 Number,1 Symbol,1 Upper case latter,1 Lower case letter");
                }else
                {
                    Intent intent = new Intent(Login_activity.this, Home_Screen.class);
                    startActivity(intent);
                }
            }
        });



    }
}