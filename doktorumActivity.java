package com.saniyebilgic.newproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class doktorumActivity extends AppCompatActivity {
    private Button btn_randevu;
    private Button btn_doktor_ara;
    private Button btn_randevu_alarm;
    private Button btn_alarm_kapat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doktorum);
        btn_randevu = findViewById(R.id.button25);
        btn_doktor_ara = findViewById(R.id.button24);
        btn_randevu_alarm = findViewById(R.id.button28);
        btn_randevu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randevu = new Intent(Intent.ACTION_DIAL);
                randevu.setData(Uri.parse("tel:126546865"));
                startActivity(randevu);
            }
        });

        btn_doktor_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doktor = new Intent(Intent.ACTION_DIAL);
                doktor.setData(Uri.parse("tel:5465685323"));
                startActivity(doktor);

            }
        });

        btn_randevu_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randevu_alarm = new Intent(doktorumActivity.this, kimgeldiActivity.class);
                startActivity(randevu_alarm);
            }
        });


    }
}