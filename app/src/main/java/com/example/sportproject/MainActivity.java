package com.example.sportproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnperexod =(Button)findViewById(R.id.btnperexod);
        btnperexod.setOnClickListener(this);

    }
    @Override
    public void onClick (View view) {
        Intent intent = new Intent(view.getContext(), GlavMenu.class);
        startActivity(intent);
    }

}