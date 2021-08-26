package com.saniyebilgic.newproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class acilActivity extends AppCompatActivity {

    Button saglık;
    Button itfiaye;
    Button polis;
    Button yangın;
    Button jandarma;
    Button danısma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acil);
        saglık=findViewById(R.id.kisisil);
        itfiaye=findViewById(R.id.button4);
        polis=findViewById(R.id.button5);
        yangın=findViewById(R.id.button13);
        jandarma=findViewById(R.id.button14);
        danısma=findViewById(R.id.button15);

    }
    public  void saglık(View view) {
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:112"));
        startActivity(intent);
    }
    public  void itfiaye(View view) {
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:110"));
        startActivity(intent);
    }
    public  void polis(View view) {
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:155"));
        startActivity(intent);

    }
    public  void yangın(View view) {
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:177"));
        startActivity(intent);
    }
    public  void jandarma(View view) {
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:156"));
        startActivity(intent);
    }
    public void danısma(View view) {
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:114"));
        startActivity(intent);
    }

}