package com.app.hudhud.islam;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Bon_Betingelser extends AppCompatActivity {

    private static final String TOOLBAR_TITLE = "Bønnens betingelser";
    private Intent intent;
    private final String[] tabTitles = {"Islam", "Qiblah", "Bønindtrædelse", "At-tamjiz-alderen", "Forpligtelsen", "Bønnens søjler", "^Awrah"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs);

        ViewPager2 viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter_Bon_Betingelser(this));

        TabLayout tabLayout = findViewById(R.id.tab_layout);

        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    tab.setText(tabTitles[position]);
                }
        ).attach();

        Toolbar toolbar = findViewById(R.id.main_title);
        toolbar.setTitle(TOOLBAR_TITLE);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                finish();
            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.Forside) {
            intent = new Intent(this, Frontpage.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
