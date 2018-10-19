package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mostarda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_mostarda);
    }
    public void VoltarTela(View view){

        Intent primavera = new Intent(getApplicationContext(),Hprimavera2.class);
        startActivity(primavera);
        finish();

    }

    public void ProximaTela(View view){

        Intent proxima = new Intent(getApplicationContext(),mostarda2.class);
        startActivity(proxima);
        finish();

    }
}
