package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hinverno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hinverno);
    }
    public void cebolinha(View view){
        Intent Cebolinha = new Intent(getApplicationContext(),cebolinha1.class);
        startActivity(Cebolinha);
        finish();
    }
    public void agriao(View view){
        Intent Agriao = new Intent(getApplicationContext(),agriao.class);
        startActivity(Agriao);
        finish();
    }
    public void mostarda(View view){
        Intent Mostarda = new Intent(getApplicationContext(),mostarda.class);
        startActivity(Mostarda);
        finish();
    }
    public void VoltarTela(View view){
        Intent voltar = new Intent(getApplicationContext(),tela3.class);
        startActivity(voltar);
        finish();
    }
   
}
