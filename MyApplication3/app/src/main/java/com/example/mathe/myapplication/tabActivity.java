package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.MenuItem;


public class tabActivity extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Voltar ao menu");
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(this, tela2.class));
        finishAffinity();
        return;
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

    //deletado
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    FragmentPrimavera fragPrimavera = new FragmentPrimavera();
                    return fragPrimavera;
                case 1:
                    FragmentVerao fragVerao = new FragmentVerao();
                    return fragVerao;
                case 2:
                    FragmentOutono fragOutono = new FragmentOutono();
                    return fragOutono;
                case 3:
                    FragmentInverno fragInverno = new FragmentInverno();
                    return fragInverno;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Primavera";
                case 1:
                    return "Verão";
                case 2:
                    return "Outono";
                case 3:
                    return "Inverno";
            }
            return null;
        }
    }
}
