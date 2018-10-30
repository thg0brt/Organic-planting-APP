package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela3);
    }

    public void VoltarTela(View view){
        Intent voltar = new Intent(getApplicationContext(),tela2.class);
        startActivity(voltar);
        finish();
    }
    public void primavera(View view){
        Intent Primavera = new Intent(getApplicationContext(),Hprimavera.class);
        startActivity(Primavera);
        finish();
    }
    public void verao(View view){
        Intent Verao = new Intent(getApplicationContext(),Hverao.class);
        startActivity(Verao);
        finish();
    }
    public void outono(View view){
        Intent Outono = new Intent(getApplicationContext(),Houtono.class);
        startActivity(Outono);
        finish();
    }
    public void inverno(View view){
        Intent Inverno = new Intent(getApplicationContext(),Hinverno.class);
        startActivity(Inverno);
        finish();
    }
}
