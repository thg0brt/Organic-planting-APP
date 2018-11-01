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
    public void agriao(View view){

        Intent Agriao = new Intent(getApplicationContext(),agriao.class);
        startActivity(Agriao);
        finish();

    }
    public void VoltarTela(View view){
        Intent voltar = new Intent(getApplicationContext(),tela3.class);
        startActivity(voltar);
        finish();
    }
}
