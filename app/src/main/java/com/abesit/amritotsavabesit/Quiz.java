package com.abesit.amritotsavabesit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.abesit.amritotsavabesit.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class Quiz extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private final int timer=10;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    private TabLayout tabLayout2;
    private ViewPager2 vp2;
    private LogoFragmentAdapter logoadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tabLayout2= findViewById(R.id.tabforquiz);
        vp2= findViewById(R.id.VP2);

        tabLayout2.addTab(tabLayout2.newTab().setText("LOGO Quiz"));
        tabLayout2.addTab(tabLayout2.newTab().setText("Departmental Quiz"));

        FragmentManager fragmentManager2= getSupportFragmentManager();
        logoadapter= new LogoFragmentAdapter(fragmentManager2,getLifecycle());
        vp2.setAdapter(logoadapter);

        tabLayout2.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        vp2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout2.selectTab(tabLayout2.getTabAt(position));
            }
        });

        DrawerLayout drawerLayout = findViewById(R.id.Dlayout2);
        NavigationView navigationView = findViewById(R.id.nav_view);

        Toolbar toolbar = findViewById(R.id.toolbar);


        navigationView.bringToFront();

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainintent = new Intent(Quiz.this, Techselect.class);
                startActivity(mainintent);
                finish();

            }
        },timer);
        //super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_home:
                Intent taketohome = new Intent(this, screen.class);
                startActivity(taketohome);
                break;
            case R.id.nav_techno:
                Intent taketotech = new Intent(this, Techselect.class);
                startActivity(taketotech);
                break;
            case R.id.nav_cult:
                Intent taketocult = new Intent(this, CulturalselectActivity.class);
                startActivity(taketocult);
                break;
            case R.id.nav_litrary:
                Intent taketolit = new Intent(this,Litselect.class);
                startActivity(taketolit);
                break;
            case R.id.nav_FineNPic:
                Intent taketofine = new Intent(this,Fineselect.class);
                startActivity(taketofine);
                break;
            case R.id.nav_venue:
                String venueurl= "https://g.page/ABESITcollegeofengineering?share";
                Intent venue = new Intent(Intent.ACTION_VIEW);
                venue.setData(Uri.parse(venueurl));
                startActivity(venue);
                break;
            case R.id.nav_help:
                Intent contactus = new Intent(this,Teams.class);
                startActivity(contactus);
                break;

        }
        return true;
    }
}