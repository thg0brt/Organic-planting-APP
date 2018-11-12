package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Houtono extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_houtono);
    }
    public void acelga(View view){
        Intent Acelga = new Intent(getApplicationContext(),acelga.class);
        startActivity(Acelga);
        finish();
    }
     public void agriao(View view){
       Intent Agriao = new Intent(getApplicationContext(),agriao_outono.class);
        startActivity(Agriao);
        finish();
    }

    public void aipo(View view){
        Intent Aipo = new Intent(getApplicationContext(),aipo.class);
        startActivity(Aipo);
        finish();
    }
    public void rucula(View view){
        Intent Rucula = new Intent(getApplicationContext(),rucula_outono.class);
        startActivity(Rucula);
        finish();
    }
    public void almeirao(View view){
        Intent Almeirao = new Intent(getApplicationContext(),almeirao.class);
        startActivity(Almeirao);
        finish();
    }
    public void VoltarTela(View view){
        Intent voltar = new Intent(getApplicationContext(),tela3.class);
        startActivity(voltar);
        finish();
    }
}
