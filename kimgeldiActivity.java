package com.saniyebilgic.newproje;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class kimgeldiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kimgeldi);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        final TimePicker timePicker = findViewById(R.id.time_picker);
        final Calendar calendar = Calendar.getInstance();
        Button alarm_kur = findViewById(R.id.alarm_kur);
        Button alarm_kapat = findViewById(R.id.alarm_kapat);
        final TextView bilgi_yaz = findViewById(R.id.bilgi_yaz);

        alarm_kur.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                calendar.set(Calendar.HOUR_OF_DAY, timePicker.getHour());
                calendar.set(Calendar.MINUTE, timePicker.getMinute());
                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();

                String hours = String.valueOf(hour);
                String minutes = String.valueOf(minute);
                bilgi_yaz.setText(hours + ":" + minutes);


            }
        });

        alarm_kapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
    public void alarmkapat (View view) {
        Intent intent=new Intent(kimgeldiActivity.this,ikincianasayfa.class);
        startActivity(intent);
    }
}