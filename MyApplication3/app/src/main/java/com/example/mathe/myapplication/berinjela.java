package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class berinjela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berinjela);
    }
    public void Lprimavera(View view){

        Intent primavera = new Intent(getApplicationContext(),Hprimavera2.class);
        startActivity(primavera);
        finish();

    }

    public void ProximaTela(View view){

        Intent proxima = new Intent(getApplicationContext(),berinjela2.class);
        startActivity(proxima);
        finish();

    }
}
