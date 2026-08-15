package com.example.hcare;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration_page extends AppCompatActivity {

    EditText rgName,rgMobile,rgEmail,rgUsername,rgPassword,rgConfirmPassword;
    Button btnRegister;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registration_page);

        rgName=findViewById(R.id.rgName);
        rgMobile=findViewById(R.id.rgMobile);
        rgEmail=findViewById(R.id.rgEmail);
        rgPassword=findViewById(R.id.rgPassword);
        rgConfirmPassword=findViewById(R.id.rgConfirmPassword);
        rgUsername=findViewById(R.id.rgUsername);
        btnRegister=findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rgName.getText().toString().isEmpty())
                {
                    rgName.setError("Plese Enter Your Name");
                }
                else if(rgMobile.getText().toString().isEmpty())
                {
                    rgMobile.setError("Plese Enter Your Mobaile no");
                }
                else if(rgMobile.getText().toString().length()!=10)
                {
                    rgMobile.setError("Mobaile No. Must Be 10");
                }
                else if(rgEmail.getText().toString().isEmpty())
                {
                    rgEmail.setError("Please enter your Email");
                }
                else if(!rgEmail.getText().toString().contains("@") || !rgEmail.getText().toString().contains(".com"))
                {
                    rgEmail.setError("Please enter valid email id");
                }
                else  if (rgUsername.getText().toString().isEmpty())
                {
                    rgUsername.setError("Please enter your username");
                }
                else  if (rgPassword.getText().toString().isEmpty())
                {
                    rgPassword.setError("Please enter your Password");
                }
                else if (rgUsername.getText().toString().length()<8)
                {
                    rgUsername.setError("Username must be more than 8");
                }
                else if (!rgUsername.getText().toString().matches(".*[A-Z].*"))
                {
                    rgUsername.setError("username must have one uppercase");
                }
                else if (!rgUsername.getText().toString().matches(".*[a-z].*"))
                {
                    rgUsername.setError("username must have one lowercase");
                }
                else if (!rgUsername.getText().toString().matches(".*[0-9].*"))
                {
                    rgUsername.setError("username must have one number");
                }
                else if (!rgUsername.getText().toString().matches(".*[@,#,%,$,&,!].*"))
                {
                    rgUsername.setError("username must have one special symbol");
                }
                else if (!rgPassword.getText().toString().matches(".*[A-Z].*"))
                {
                    rgPassword.setError("password must have one uppercase");
                }
                else if (!rgPassword.getText().toString().matches(".*[a-z].*"))
                {
                    rgPassword.setError("password must have one lowercase");
                }
                else if (!rgPassword.getText().toString().matches(".*[0-9].*"))
                {
                    rgPassword.setError("password must have one number");
                }
                else if (!rgPassword.getText().toString().matches(".*[@,#,%,$,&,!].*"))
                {
                    rgPassword.setError("password must have one special symbol");
                }
                else if (!rgPassword.getText().toString().equals(rgConfirmPassword.getText().toString()))
                {
                    rgConfirmPassword.setError("password and confirm password must be same");
                }
                else
                {
                    Toast.makeText(Registration_page.this,"Registration Successfully Done",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}