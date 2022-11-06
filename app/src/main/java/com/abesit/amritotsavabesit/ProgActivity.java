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

public class ProgActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private final int timer=10;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    private TabLayout tabLayout1;
    private ViewPager2 vp1;
    private CodeFragmentAdapter codeFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog);

        tabLayout1=findViewById(R.id.tabforpro);
        vp1= findViewById(R.id.VP1);


        tabLayout1.addTab(tabLayout1.newTab().setText("C/C++/JAVA"));
        tabLayout1.addTab(tabLayout1.newTab().setText("MATLAB"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Python"));

        FragmentManager fragmentManager1=getSupportFragmentManager();
        codeFragmentAdapter= new CodeFragmentAdapter(fragmentManager1,getLifecycle());
        vp1.setAdapter(codeFragmentAdapter);

        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp1.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        vp1.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout1.selectTab(tabLayout1.getTabAt(position));
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
                Intent mainintent = new Intent(ProgActivity.this, Techselect.class);
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