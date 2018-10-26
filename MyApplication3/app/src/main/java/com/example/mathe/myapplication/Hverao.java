package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hverao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hverao);
    }

    public void VoltarH(View view){
        Intent H = new Intent(getApplicationContext(),tela3.class);
        startActivity(H);
        finish();
    }
    public void IrTela(View view){
        Intent irTela = new Intent(getApplicationContext(),Hverao2.class);
        startActivity(irTela);
        finish();
    }

    public void beterraba(View view){
        Intent Beterraba = new Intent(getApplicationContext(),beterraba.class);
        startActivity(Beterraba);
        finish();
    }
    public void mostarda(View view){
        Intent Mostarda = new Intent(getApplicationContext(),mostardaVerao.class);
        startActivity(Mostarda);
        finish();
    }
    public void rabanete(View view){
        Intent Rabanete = new Intent(getApplicationContext(),rabanete.class);
        startActivity(Rabanete);
        finish();
    }
    public void coentro(View view){
        Intent Coentro = new Intent(getApplicationContext(),coentro.class);
        startActivity(Coentro);
        finish();
    }
    public void cebolinha(View view){
        Intent Cebolinha = new Intent(getApplicationContext(),cebolinha1.class);
        startActivity(Cebolinha);
        finish();
    }
    public void rucula(View view){
        Intent Rucula = new Intent(getApplicationContext(),rucula.class);
        startActivity(Rucula);
        finish();
    }


}
