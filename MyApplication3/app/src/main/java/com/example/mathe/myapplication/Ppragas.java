package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ppragas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ppragas);
    }
    public void VoltarTela(View view){
        Intent menu = new Intent(getApplicationContext(),tela2.class);
        startActivity(menu);
        finish();
    }
}
