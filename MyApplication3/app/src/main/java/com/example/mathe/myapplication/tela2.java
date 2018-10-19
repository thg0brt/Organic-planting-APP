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

        Intent Hortaliças = new Intent(getApplicationContext(),tela3.class);
        startActivity(Hortaliças);

    }
}
