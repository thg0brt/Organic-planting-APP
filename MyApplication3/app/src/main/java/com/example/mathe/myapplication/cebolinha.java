package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cebolinha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cebolinha);
    }
    public void VoltarTela(View view){

        Intent inverno = new Intent(getApplicationContext(),Hinverno.class);
        startActivity(inverno);
        finish();

    }
}
