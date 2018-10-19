package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tela4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela4);
    }

    public void VoltarTela(View view){

        Intent primeiraTela = new Intent(getApplicationContext(),tela3.class);
        startActivity(primeiraTela);
        finish();

    }
    public void IrMenu(View view){

        Intent menu = new Intent(getApplicationContext(),tela2.class);
        startActivity(menu);
        finish();

    }
}
