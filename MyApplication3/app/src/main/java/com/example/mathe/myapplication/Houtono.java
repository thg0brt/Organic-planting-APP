package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Houtono extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_houtono);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Voltar às estações");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, tabActivity.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }
    @Override
    public void onBackPressed(){
        startActivity(new Intent(this, tabActivity.class));
        finishAffinity();
        return;
    }
    // -------------------------------------------------------------------------------------------------------------
    public void acelga(View view){
        Intent Acelga = new Intent(getApplicationContext(),acelga.class);
        startActivity(Acelga);
        finish();
    }
     public void agriao(View view){
       Intent Agriao = new Intent(getApplicationContext(),agriao_outono.class);
        startActivity(Agriao);
        finish();
    }

    public void aipo(View view){
        Intent Aipo = new Intent(getApplicationContext(),aipo.class);
        startActivity(Aipo);
        finish();
    }
    public void rucula(View view){
        Intent Rucula = new Intent(getApplicationContext(),rucula_outono.class);
        startActivity(Rucula);
        finish();
    }
    public void almeirao(View view){
        Intent Almeirao = new Intent(getApplicationContext(),almeirao.class);
        startActivity(Almeirao);
        finish();
    }
    public void repolho(View view){
        Intent Repolho = new Intent(getApplicationContext(),repolho.class);
        startActivity(Repolho);
        finish();
    }
    public void cebola(View view){
        Intent Cebola = new Intent(getApplicationContext(),cebola.class);
        startActivity(Cebola);
        finish();
    }
    public void couve_flor(View view){
        Intent Couve_flor = new Intent(getApplicationContext(),couveflor.class);
        startActivity(Couve_flor);
        finish();
    }
    public void salsa(View view){
        Intent Salsa = new Intent(getApplicationContext(),salsa.class);
        startActivity(Salsa);
        finish();
    }
    public void alface(View view){
        Intent Alface = new Intent(getApplicationContext(),alface.class);
        startActivity(Alface);
        finish();
    }
    public void VoltarTela(View view){
        Intent voltar = new Intent(getApplicationContext(),tabActivity.class);
        startActivity(voltar);
        finish();
    }
}
