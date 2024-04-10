package com.example.sportproject;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.util.Calendar;

public class Yvedo extends AppCompatActivity {
    TextView texttime;
    int t1Hour,t1Minute;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activivty_yvedo);
        texttime =findViewById(R.id.texttime);
        texttime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        Yvedo.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                t1Hour = hourOfDay;
                                t1Minute = minute;
                                android.text.format.DateFormat df = new android.text.format.DateFormat();
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(0,0,0,t1Hour,t1Minute);
                                texttime.setText(df.format("hh:mm aa",calendar));

                            }
                        }, 12,0,false
                );
                timePickerDialog.updateTime(t1Hour,t1Minute);
                timePickerDialog.show();
            }
        });

    }

}
