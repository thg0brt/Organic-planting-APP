package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class acelga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acelga);
    }
    public void VoltarTela(View view){
        Intent outono = new Intent(getApplicationContext(),Houtono.class);
        startActivity(outono);
        finish();

    }
}
