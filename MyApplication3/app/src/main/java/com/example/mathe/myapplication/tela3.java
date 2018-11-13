package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Voltar ao menu");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, tela2.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }
    @Override
    public void onBackPressed(){
        startActivity(new Intent(this, tela2.class));
        finishAffinity();
        return;
    }
    // -------------------------------------------------------------------------------------------------------------
    public void VoltarTela(View view){
        Intent voltar = new Intent(getApplicationContext(),tela2.class);
        startActivity(voltar);
        finish();
    }
    public void primavera(View view){
        Intent Primavera = new Intent(getApplicationContext(),Hprimavera.class);
        startActivity(Primavera);
        finish();
    }
    public void verao(View view){
        Intent Verao = new Intent(getApplicationContext(),Hverao.class);
        startActivity(Verao);
        finish();
    }
    public void outono(View view){
        Intent Outono = new Intent(getApplicationContext(),Houtono.class);
        startActivity(Outono);
        finish();
    }
    public void inverno(View view){
        Intent Inverno = new Intent(getApplicationContext(),Hinverno.class);
        startActivity(Inverno);
        finish();
    }
}
