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

public class Techselect extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private final int timer=10;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Button event11,event7,event6,event13,event12,event1,event2,event3,event4,event5,event8,event9,event10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techselect);

        DrawerLayout drawerLayout = findViewById(R.id.Dlayout2);
        NavigationView navigationView = findViewById(R.id.nav_view);

        Toolbar toolbar = findViewById(R.id.toolbar);
        Button event7 = findViewById(R.id.event7tech);
        Button event11 = findViewById(R.id.event11tech);
        Button event6 = findViewById(R.id.event6tech);
        Button event13 = findViewById(R.id.event13tech);
        Button event12 = findViewById(R.id.event12tech);
        Button event1 = findViewById(R.id.event1tech);
        Button event2 = findViewById(R.id.event2tech);
        Button event3 = findViewById(R.id.event3tech);
        Button event4 = findViewById(R.id.event4tech);
        Button event5 = findViewById(R.id.event5tech);
        Button event8 = findViewById(R.id.event8tech);
        Button event9 = findViewById(R.id.event9tech);
        Button event10 = findViewById(R.id.event10tech);



        event7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent techpost = new Intent(Techselect.this, Techposter.class);
                startActivity(techpost);
                finish();
            }
        });
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forcode = new Intent(Techselect.this, ProgActivity.class);
                startActivity(forcode);
                finish();
            }
        });

        event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizy = new Intent(Techselect.this, Quiz.class);
                startActivity(quizy);
                finish();
            }
        });
        event3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linf = new Intent(Techselect.this, LineFollower.class);
                startActivity(linf);
                finish();
            }
        });
        event4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent war_robo = new Intent(Techselect.this, RoboWar.class);
                startActivity(war_robo);
                finish();
            }
        });
        event5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent race_robotics = new Intent(Techselect.this, Roborace.class);
                startActivity(race_robotics);
                finish();
            }
        });
        event8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gliders = new Intent(Techselect.this, GlideIt.class);
                startActivity(gliders);
                finish();
            }
        });
        event9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bridge = new Intent(Techselect.this, BridgeIt.class);
                startActivity(bridge);
                finish();
            }
        });
        event10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webit = new Intent(Techselect.this, Webd.class);
                startActivity(webit);
                finish();
            }
        });

        event13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wme = new Intent(Techselect.this, WorkingM.class);
                startActivity(wme);
                finish();
            }
        });
        event12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frug = new Intent(Techselect.this, Frugal.class);
                startActivity(frug);
                finish();
            }
        });

        event6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent egoego = new Intent(Techselect.this, EgoGreen.class);
                startActivity(egoego);
                finish();
            }
        });

        event11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent carribeanhunting = new Intent(Techselect.this, carrib_hunt.class);
                startActivity(carribeanhunting);
                finish();
            }
        });

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
                Intent mainintent = new Intent(Techselect.this, screen.class);
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