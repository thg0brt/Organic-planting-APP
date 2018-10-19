package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
    public void irTela2(View view){

        Intent intent1 = new Intent(getApplicationContext(),tela2.class);
        startActivity(intent1);
        finish();
        Toast.makeText(getApplicationContext(), "Escolha uma das Opções do Menu", Toast.LENGTH_SHORT).show();


    }
}
