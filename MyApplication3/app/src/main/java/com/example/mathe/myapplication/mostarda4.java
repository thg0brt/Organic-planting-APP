package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mostarda4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_mostarda4);
    }
    public void VoltarTela(View view){

        Intent voltar = new Intent(getApplicationContext(),mostarda3.class);
        startActivity(voltar);
        finish();

    }
}
