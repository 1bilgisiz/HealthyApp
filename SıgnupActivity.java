package com.saniyebilgic.newproje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SıgnupActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    EditText emailText;
    EditText parolaText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toast.makeText(SıgnupActivity.this,"Uygulamaya Giriş Yapıldı",Toast.LENGTH_LONG).show();

        firebaseAuth=FirebaseAuth.getInstance();
        emailText=findViewById(R.id.editTextTextPersonName);
        parolaText=findViewById(R.id.editTextTextPersonName2);

        //giriş yaptıktan sonra çıkış yapana kadar açık kalır. !!!!!! (en kısa yolu)
        FirebaseUser firebaseUser=firebaseAuth.getCurrentUser();
        if (firebaseUser!=null){
            Intent intent=new Intent(SıgnupActivity.this,ikincianasayfa.class);
            startActivity(intent);
            finish();
        }
    }


    //giriş butonunu işlevlendirme
    public  void giris(View view) {

        String email= emailText.getText().toString();
        String parola= parolaText.getText().toString();
        firebaseAuth.signInWithEmailAndPassword(email,parola).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Intent intent= new Intent(SıgnupActivity.this,ikincianasayfa.class);
                startActivity(intent);
                finish();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

                Toast.makeText(SıgnupActivity.this,e.getLocalizedMessage().toString(),Toast.LENGTH_LONG).show();
            }
        });

    }





    //üye olma butanonun işlevlendirme
    public void üyeol(View view){
        String email= emailText.getText().toString();
        String parola= parolaText.getText().toString();
        firebaseAuth.createUserWithEmailAndPassword(email,parola).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {   // kayıt başarılı olursa
                Toast.makeText(SıgnupActivity.this,"Kullanıcı Oluşturuldu !",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(SıgnupActivity.this,ikincianasayfa.class);
                startActivity(intent);
                finish();



            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) { //kayıt başarısız olursa
                //hata mesajını anlayacagımız dile çeviridk.
                Toast.makeText(SıgnupActivity.this,e.getLocalizedMessage().toString(), Toast.LENGTH_LONG).show();

            }
        });


    }

}