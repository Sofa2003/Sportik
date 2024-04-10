package com.example.sportproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Nastroiki extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nastroiki);
        BottomNavigationView bottomNavigationView = findViewById(R.id.botnaviga);
        bottomNavigationView.setSelectedItemId(R.id.nastroiprofi);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.treniprofi) {
                startActivity(new Intent(getApplicationContext(),GlavMenu.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (id == R.id.otchetprofi) {
                startActivity(new Intent(getApplicationContext(), Otchet.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (id == R.id.nastroiprofi) {

                return true;
            }
            return false;
        });

    }
}
