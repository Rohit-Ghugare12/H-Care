package com.example.hcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
public class Login_activity extends AppCompatActivity {

    TextView tvForgetPassword,tvRegisterhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvForgetPassword = findViewById(R.id.tvForgetPassword);
        tvRegisterhere = findViewById(R.id.tvRegisterhere);

        tvRegisterhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login_activity.this,Registration_page.class);
                startActivity(i);
            }
        });

        tvForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_activity.this, Home_Screen.class);
                startActivity(intent);
            }
        });



    }
}