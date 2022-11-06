package com.abesit.amritotsavabesit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.abesit.amritotsavabesit.R;
import com.google.android.material.navigation.NavigationView;

public class CulturalselectActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private final int timer=10;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Button event1,event2,event3,event4,event5,event6,event7,event8,event9,event10,event11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culturalselect);

        DrawerLayout drawerLayout = findViewById(R.id.Dlayout2);
        NavigationView navigationView = findViewById(R.id.nav_view);

        Toolbar toolbar = findViewById(R.id.toolbar);

        navigationView.bringToFront();

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);

        Button event1 = findViewById(R.id.event1cult);
        Button event2 = findViewById(R.id.event2cult);
        Button event3 = findViewById(R.id.event3cult);
        Button event4 = findViewById(R.id.event4cult);
        Button event5 = findViewById(R.id.event5cult);
        Button event6 = findViewById(R.id.event6cult);
        Button event7 = findViewById(R.id.event7cult);
        Button event8 = findViewById(R.id.event8cult);
        Button event9 = findViewById(R.id.event9cult);
        Button event10 = findViewById(R.id.event10cult);
        Button event11 = findViewById(R.id.event11cult);

        //eventonclicklisteners
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent solo_singing = new Intent(CulturalselectActivity.this, solosinging.class);
                startActivity(solo_singing);
                finish();
            }
        });
        event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent duet_singing = new Intent(CulturalselectActivity.this, Duetsinging.class);
                startActivity(duet_singing);
                finish();
            }
        });
        event3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent grp_singing = new Intent(CulturalselectActivity.this, Groupsinging.class);
                startActivity(grp_singing);
                finish();
            }
        });
        event4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent solo_dancing = new Intent(CulturalselectActivity.this, SoloDance.class);
                startActivity(solo_dancing);
                finish();
            }
        });
        event5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent duetdancing = new Intent(CulturalselectActivity.this, DuetDance.class);
                startActivity(duetdancing);
                finish();
            }
        });
        event6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent grpdancing = new Intent(CulturalselectActivity.this, GroupDance.class);
                startActivity(grpdancing);
                finish();
            }
        });
        event7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ftb = new Intent(CulturalselectActivity.this, Followthebeats.class);
                startActivity(ftb);
                finish();
            }
        });
        event8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skt = new Intent(CulturalselectActivity.this, skit.class);
                startActivity(skt);
                finish();
            }
        });
        event9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suc = new Intent(CulturalselectActivity.this, standupcom.class);
                startActivity(suc);
                finish();
            }
        });
        event10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fashow = new Intent(CulturalselectActivity.this, fashionshow.class);
                startActivity(fashow);
                finish();
            }
        });
        event11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent band = new Intent(CulturalselectActivity.this, bandwars.class);
                startActivity(band);
                finish();
            }
        });


    }

    @Override
    public void onBackPressed() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainintent = new Intent(CulturalselectActivity.this, screen.class);
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
                Intent taketotech = new Intent(this,Techselect.class);
                startActivity(taketotech);
                break;
            case R.id.nav_cult:
                break;
            case R.id.nav_litrary:
                Intent taketolit = new Intent(this, Litselect.class);
                startActivity(taketolit);
                break;
            case R.id.nav_FineNPic:
                Intent taketofin = new Intent(this,Fineselect.class);
                startActivity(taketofin);
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