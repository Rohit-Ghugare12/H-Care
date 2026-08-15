package com.example.hcare;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        Handler h=new Handler(getMainLooper ());
        h.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent i = new Intent(Splash_Screen.this,Login_activity.class);
                startActivity(i);
                finish();

            }
        }, 2000);

    }
}