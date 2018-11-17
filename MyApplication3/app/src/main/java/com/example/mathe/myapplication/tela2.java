package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela2);
    }

    public void irHortaliças(View view){
        Intent Hortaliças = new Intent(getApplicationContext(),tabActivity.class);
        startActivity(Hortaliças);
    }

    public void CombateP(View view){

        Intent CP = new Intent(getApplicationContext(),Cpragas.class);
        startActivity(CP);

    }
    public void Insumos(View view){
        Intent insumo = new Intent(getApplicationContext(),Linsumos.class);
        startActivity(insumo);

    }
}
