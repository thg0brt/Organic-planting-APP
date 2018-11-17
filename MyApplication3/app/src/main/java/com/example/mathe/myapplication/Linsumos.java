package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Linsumos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linsumos);
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
    public void Composteira(View view){
        Intent composteira = new Intent(getApplicationContext(),composteira.class);
        startActivity(composteira);
        finish();
    }
    public void NPK(View view){
        Intent npk = new Intent(getApplicationContext(),npk.class);
        startActivity(npk);
        finish();
    }
    public void BORRA(View view){
        Intent borra = new Intent(getApplicationContext(),borraCafe.class);
        startActivity(borra);
        finish();
    }
}
