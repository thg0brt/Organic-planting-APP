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

    public void ProximaTela(View view){

        Intent segundaTela = new Intent(getApplicationContext(),tela4.class);
        startActivity(segundaTela);
        finish();

    }
    public void IrMenu(View view){

        Intent menu = new Intent(getApplicationContext(),tela2.class);
        startActivity(menu);
        finish();

    }
    public void Primavera(View view){

        Intent HortaliçasP = new Intent(getApplicationContext(),Hprimavera.class);
        startActivity(HortaliçasP);
        finish();

    }
}
