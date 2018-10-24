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

        Intent voltar = new Intent(getApplicationContext(),mostardaVerao.class);
        startActivity(voltar);
        finish();

    }

}
