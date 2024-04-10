package com.example.sportproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class GlavMenu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavmenu);
        BottomNavigationView bottomNavigationView = findViewById(R.id.botnaviga);
        bottomNavigationView.setSelectedItemId(R.id.treniprofi);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.treniprofi) {
                return true;
            } else if (id == R.id.otchetprofi) {
                startActivity(new Intent(getApplicationContext(), Otchet.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (id == R.id.nastroiprofi) {
                startActivity(new Intent(getApplicationContext(), Nastroiki.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            return false;
        });






    }
}