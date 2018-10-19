package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class berinjela4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_berinjela4);
    }
    public void VoltarTela(View view){

        Intent voltar = new Intent(getApplicationContext(),berinjela3.class);
        startActivity(voltar);
        finish();

    }
}
