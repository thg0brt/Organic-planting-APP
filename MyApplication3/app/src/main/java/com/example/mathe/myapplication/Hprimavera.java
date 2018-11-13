package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Hprimavera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hprimavera);
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
    public void Abobora(View view){

        Intent abobora = new Intent(getApplicationContext(),abobora1.class);
        startActivity(abobora);
        finish();

    }
    public void cenoura(View view){

        Intent Cenoura = new Intent(getApplicationContext(),cenoura1.class);
        startActivity(Cenoura);
        finish();

    }
    public void Tomate(View view){

        Intent tomate = new Intent(getApplicationContext(),tomate1.class);
        startActivity(tomate);
        finish();

    }
    public void Agriao(View view){

        Intent agriao = new Intent(getApplicationContext(),agriao.class);
        startActivity(agriao);
        finish();

    }
    public void Melancia(View view){

        Intent melancia = new Intent(getApplicationContext(),melancia1.class);
        startActivity(melancia);
        finish();

    }
    public void Pimentao(View view){

        Intent pimentao = new Intent(getApplicationContext(),pimentao1.class);
        startActivity(pimentao);
        finish();

    }
    public void Berinjela(View view){

        Intent berinjela = new Intent(getApplicationContext(),berinjela1.class);
        startActivity(berinjela);
        finish();

    }
    public void Mostarda(View view){

        Intent mostarda = new Intent(getApplicationContext(),mostarda.class);
        startActivity(mostarda);
        finish();

    }
    public void VoltarTela(View view){
        Intent voltar = new Intent(getApplicationContext(),tela3.class);
        startActivity(voltar);
        finish();
    }
}
