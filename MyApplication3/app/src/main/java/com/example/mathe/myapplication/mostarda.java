package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mostarda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_mostarda);
    }
    public void VoltarTela(View view){

        Intent primavera = new Intent(getApplicationContext(),tela3.class);
        startActivity(primavera);
        finish();

    }
}
