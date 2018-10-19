package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class melancia3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_melancia3);
    }
    public void VoltarTela(View view){

        Intent voltar = new Intent(getApplicationContext(),melancia2.class);
        startActivity(voltar);
        finish();

    }
}
