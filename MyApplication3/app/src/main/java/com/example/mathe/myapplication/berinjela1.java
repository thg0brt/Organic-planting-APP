package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class berinjela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berinjela1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Voltar às hortaliças");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, Hprimavera.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }
    @Override
    public void onBackPressed(){
        startActivity(new Intent(this, Hprimavera.class));
        finishAffinity();
        return;
    }
    // -------------------------------------------------------------------------------------------------------------
    public void VoltarTela(View view){
        Intent primavera = new Intent(getApplicationContext(),Hprimavera.class);
        startActivity(primavera);
        finish();
    }
}
