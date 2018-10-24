package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hprimavera2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hprimavera2);
    }

    public void VoltarH(View view){

        Intent H = new Intent(getApplicationContext(),tela3.class);
        startActivity(H);
        finish();

    }
    public void VoltarTela(View view){

        Intent voltar = new Intent(getApplicationContext(),Hprimavera.class);
        startActivity(voltar);
        finish();

    }
    public void Berinjela(View view){

        Intent berinjela = new Intent(getApplicationContext(),berinjela1.class);
        startActivity(berinjela);
        finish();

    }
    public void Mostarda(View view){

        Intent mostarda = new Intent(getApplicationContext(),mostarda.class);
        startActivity(mostarda);
        finish();

    }
}
