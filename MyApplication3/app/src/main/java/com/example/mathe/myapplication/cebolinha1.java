package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cebolinha1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cebolinha1);
    }
    public void VoltarTela(View view){

        Intent inverno = new Intent(getApplicationContext(),tela3.class);
        startActivity(inverno);
        finish();

    }
}
