package com.saniyebilgic.newproje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class ikincianasayfa extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    Button ailem;
    Button alarm;
    Button ilaclarim;
    Button nerdeyim;
    Button doktorum;
    Button alisveris;
    Button acil;
    //menüyü baglamamız gereken option
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         //menüyü ekledik.
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.opsions_menu,menu);
        return super.onCreateOptionsMenu(menu);


    }


    //menüde bişey seçilirse yapılacak işlemler
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()== R.id.upload){
            Intent intentupload= new Intent(ikincianasayfa.this, UpLoadActivity.class);
            startActivity(intentupload);
        } else if (item.getItemId()==R.id.cıkıs){
            firebaseAuth.signOut();
            Intent intentsignin= new Intent(ikincianasayfa.this,SıgnupActivity.class);
            startActivity(intentsignin);
            finish();
            Toast.makeText(ikincianasayfa.this,"Çıkış yapıldı",Toast.LENGTH_LONG).show();

        }

        return super.onOptionsItemSelected(item);
    }


    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ikincianasayfa);

        firebaseAuth=FirebaseAuth.getInstance();
        ailem=findViewById(R.id.button10);
        alarm=findViewById(R.id.button11);
        ilaclarim=findViewById(R.id.button8);
        nerdeyim=findViewById(R.id.button9);
        doktorum=findViewById(R.id.button12);
        alisveris=findViewById(R.id.button16);
        acil=findViewById(R.id.button17);

    }



    public void alarm  (View view) {

        Intent intent=new Intent(ikincianasayfa.this,kimgeldiActivity.class);
        startActivity(intent);

    }

    public void ilaclarim (View view) {

        Intent intent=new Intent(ikincianasayfa.this, ilaclarActivity.class);
        startActivity(intent);

    }

    public void nerdeyim (View view) {

        Intent intent=new Intent(ikincianasayfa.this,MapsActivity.class);
        startActivity(intent);

    }


    public void doktorum (View view) {
        Intent intent=new Intent(ikincianasayfa.this,doktorumActivity.class);
        startActivity(intent);

    }

    public void alisveris   (View view) {
        Intent intent=new Intent(ikincianasayfa.this,alisverisActivity.class);
        startActivity(intent);
    }

    public void  acil (View view) {
        Intent intent=new Intent(ikincianasayfa.this, acilActivity.class);
        startActivity(intent);
    }

    public void ailem(View view) {
        Intent intent=new Intent(ikincianasayfa.this, activity_aile.class);
        startActivity(intent);
    }



}