package com.app.hudhud.islam;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class Fasten_Sojler extends AppCompatActivity {

    private final String[] tabTitles = {"Hensigten", "Afbrydelser"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs);

        ViewPager2 viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter_Fasten_Sojler(this));

        TabLayout tabLayout = findViewById(R.id.tab_layout);

        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    tab.setText(tabTitles[position]);
                }
        ).attach();

        Toolbar toolbar = findViewById(R.id.main_title);
        toolbar.setTitle("Fastens søjler");
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.Forside) {
            startActivity(new Intent(this, Frontpage.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
