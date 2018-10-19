package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class abobora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_abobora);
    }

    public void Lprimavera(View view){

        Intent primavera = new Intent(getApplicationContext(),Hprimavera.class);
        startActivity(primavera);
        finish();

    }

    public void ProximaTela(View view){

        Intent proxima = new Intent(getApplicationContext(),abobora2.class);
        startActivity(proxima);
        finish();

    }
}
