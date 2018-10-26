package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rucula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_rucula);
    }
    public void VoltarTela(View view){
        Intent verao = new Intent(getApplicationContext(),Hverao.class);
        startActivity(verao);
        finish();
    }
}
