package com.example.latihan2gerdiabdisalam;
/*
Nama : Gerdi Abdi Salam
NIM  : 10116474
KELAS : AKB-IF11
Tanggal Pengerjaan : 18 April 2019
*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {
    Button btnDaftar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnDaftar = (Button) findViewById(R.id.daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(register.this, AlmostThere.class);
                startActivity(i);
            }
        });
    }
}
