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

public class Litselect extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private final int timer=10;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Button event1,event2,event3,event4,event5,event6,event7,event8,event9,event10,event11,event12,event13,event14,event15,event16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_litselect);
        DrawerLayout drawerLayout = findViewById(R.id.Dlayout2);
        NavigationView navigationView = findViewById(R.id.nav_view);

        Toolbar toolbar = findViewById(R.id.toolbar);

        navigationView.bringToFront();

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);



        Button event1 = findViewById(R.id.event1lit);
        Button event2 = findViewById(R.id.event2lit);
        Button event3 = findViewById(R.id.event3lit);
        Button event4 = findViewById(R.id.event4lit);
        Button event5 = findViewById(R.id.event5lit);
        Button event6 = findViewById(R.id.event6lit);
        Button event7 = findViewById(R.id.event7lit);
        Button event8 = findViewById(R.id.event8lit);
        Button event9 = findViewById(R.id.event9lit);
        //Button event10 = findViewById(R.id.event10lit);
        Button event11 = findViewById(R.id.event11lit);
        Button event12 = findViewById(R.id.event12lit);
        Button event13 = findViewById(R.id.event13lit);
        Button event14 = findViewById(R.id.event14lit);
        Button event15 = findViewById(R.id.event15lit);
        //Button event16 = findViewById(R.id.event16lit);


        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hpyc = new Intent(Litselect.this, HowPositive.class);
                startActivity(hpyc);
                finish();
            }
        });
        event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cwo = new Intent(Litselect.this, connectwithobject.class);
                startActivity(cwo);
                finish();
            }
        });
        event3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mif = new Intent(Litselect.this, Makeitfunny.class);
                startActivity(mif);
                finish();
            }
        });
        event4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent poemtry = new Intent(Litselect.this, Poem.class);
                startActivity(poemtry);
                finish();
            }
        });
        event5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cw = new Intent(Litselect.this, creative_write.class);
                startActivity(cw);
                finish();
            }
        });
        event6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent national = new Intent(Litselect.this, YouthP.class);
                startActivity(national);
                finish();
            }
        });
        event7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent db = new Intent(Litselect.this, Debate_activity.class);
                startActivity(db);
                finish();
            }
        });
        event8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sw = new Intent(Litselect.this, Slogan_writing.class);
                startActivity(sw);
                finish();
            }
        });
        event9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ww = new Intent(Litselect.this, Words.class);
                startActivity(ww);
                finish();
            }
        });

        event11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gkcheck = new Intent(Litselect.this, checkknow.class);
                startActivity(gkcheck);
                finish();
            }
        });
        event12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent businessplan = new Intent(Litselect.this, bussiness.class);
                startActivity(businessplan);
                finish();
            }
        });
        event13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ams = new Intent(Litselect.this, AdMad.class);
                startActivity(ams);
                finish();
            }
        });
        event14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bees = new Intent(Litselect.this, spellingbee.class);
                startActivity(bees);
                finish();
            }
        });
        event15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dumbch = new Intent(Litselect.this, Dumbcharades.class);
                startActivity(dumbch);
                finish();
            }
        });


    }



    @Override
    public void onBackPressed() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainintent = new Intent(Litselect.this, screen.class);
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
                Intent taketocult = new Intent(this, CulturalselectActivity.class);
                startActivity(taketocult);
                break;
            case R.id.nav_litrary:
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