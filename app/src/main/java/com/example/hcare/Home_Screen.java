package com.example.hcare;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_Screen extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home_screen);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuHomeAbout)
        {
            Toast.makeText(this, "About Us Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.menuHomeContact)
        {

        }
        else if (item.getItemId() == R.id.menuHomeLogOut )
        {

           logout();

        }
        else if (item.getItemId() == R.id.menuHomeSetting )
        {
            Toast.makeText(this, "Setting Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.menuHomeMap)
        {
            Toast.makeText(this, "Map Clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    private void logout()
    {

        AlertDialog.Builder ad = new AlertDialog.Builder(Home_Screen.this);
        ad.setTitle("LogOut");
        ad.setMessage("Are you want to LogOut?");
        ad.setPositiveButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad.setNegativeButton("LOGOUT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent i = new Intent(Home_Screen.this, Login_activity.class);
                startActivity(i);
                finishAffinity();
            }
        }).show().create();
    }

}