package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Hverao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hverao);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Voltar às estações");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, tela3.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }
    @Override
    public void onBackPressed(){
        startActivity(new Intent(this, tela3.class));
        finishAffinity();
        return;
    }
    // -------------------------------------------------------------------------------------------------------------
    public void beterraba(View view){
        Intent Beterraba = new Intent(getApplicationContext(),beterraba.class);
        startActivity(Beterraba);
        finish();
    }
    public void mostardaV(View view){
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
    public void mostarda(View view){
        Intent Mostarda = new Intent(getApplicationContext(),mostardaVerao.class);
        startActivity(Mostarda);
        finish();
    }
    public void espinafre(View view){
        Intent Espinafre = new Intent(getApplicationContext(),espinafre.class);
        startActivity(Espinafre);
        finish();
    }
    public void salsa(View view){

        Intent Salsa = new Intent(getApplicationContext(),salsa.class);
        startActivity(Salsa);
        finish();

    }
    public void VoltarTela(View view){
        Intent voltar = new Intent(getApplicationContext(),tela3.class);
        startActivity(voltar);
        finish();
    }

}
