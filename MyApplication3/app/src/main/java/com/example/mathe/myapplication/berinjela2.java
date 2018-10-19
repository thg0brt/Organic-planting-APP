package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class berinjela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_berinjela2);
    }

    public void Lprimavera(View view){

        Intent primavera = new Intent(getApplicationContext(),berinjela.class);
        startActivity(primavera);
        finish();

    }

    public void ProximaTela(View view){

        Intent proxima = new Intent(getApplicationContext(),berinjela3.class);
        startActivity(proxima);
        finish();

    }
}
