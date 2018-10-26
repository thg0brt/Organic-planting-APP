package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hverao2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hverao2);
    }

    public void VoltarH(View view){

        Intent H = new Intent(getApplicationContext(),tela3.class);
        startActivity(H);
        finish();

    }
    public void VoltarTela(View view){

        Intent voltar = new Intent(getApplicationContext(),Hverao.class);
        startActivity(voltar);
        finish();

    }
    public void mostarda(View view){

        Intent Mostarda = new Intent(getApplicationContext(),mostardaVerao.class);
        startActivity(Mostarda);
        finish();

    }

    public void salsa(View view){

        Intent Salsa = new Intent(getApplicationContext(),salsa.class);
        startActivity(Salsa);
        finish();

    }
    public void espinafre(View view){

        Intent Espinafre = new Intent(getApplicationContext(),espinafre.class);
        startActivity(Espinafre);
        finish();

    }

}
