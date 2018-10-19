package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class melancia2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_melancia2);
    }
    public void VoltarTela(View view){

        Intent voltar = new Intent(getApplicationContext(),melancia.class);
        startActivity(voltar);
        finish();

    }

    public void ProximaTela(View view){

        Intent proxima = new Intent(getApplicationContext(),melancia3.class);
        startActivity(proxima);
        finish();

    }
}
