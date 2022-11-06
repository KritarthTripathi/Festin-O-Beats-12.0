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

public class Fineselect extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    private final int timer=10;

    Button event1,event2,event3,event4,event5,event6,event7,event8,event9,event10,event11,event12,event13,event14,event15,event16,event17,event18,event19,event20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fineselect);
        DrawerLayout drawerLayout = findViewById(R.id.Dlayout2);
        NavigationView navigationView = findViewById(R.id.nav_view);

        Toolbar toolbar = findViewById(R.id.toolbar);

        navigationView.bringToFront();

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);


        Button event1 = findViewById(R.id.event1fine);
        Button event2 = findViewById(R.id.event2fine);
        Button event3 = findViewById(R.id.event3fine);
        Button event4 = findViewById(R.id.event4fine);
        Button event5 = findViewById(R.id.event5fine);
        //Button event6 = findViewById(R.id.event6fine);
        Button event7 = findViewById(R.id.event7fine);
        Button event8 = findViewById(R.id.event8fine);
        Button event9 = findViewById(R.id.event9fine);
        Button event10 = findViewById(R.id.event10fine);
        Button event11 = findViewById(R.id.event11fine);
        Button event12 = findViewById(R.id.event12fine);
        Button event13 = findViewById(R.id.event13fine);
        Button event14 = findViewById(R.id.event14fine);
        Button event15 = findViewById(R.id.event15fine);
        Button event16 = findViewById(R.id.event16fine);
        Button event17 = findViewById(R.id.event17fine);
        Button event18 = findViewById(R.id.event18fine);
        //Button event19 = findViewById(R.id.event19fine);
        Button event20 = findViewById(R.id.event20fine);


        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mehndi = new Intent(Fineselect.this, Mehendi.class);
                startActivity(mehndi);
                finish();
            }
        });
        event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tm = new Intent(Fineselect.this,TattooMaking.class);
                startActivity(tm);
                finish();
            }
        });
        event3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rango = new Intent(Fineselect.this, Rangoli.class);
                startActivity(rango);
                finish();
            }
        });
        event4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent potp = new Intent(Fineselect.this, PotPainting.class);
                startActivity(potp);
                finish();
            }
        });
        event5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sktch = new Intent(Fineselect.this, Sketching.class);
                startActivity(sktch);
                finish();
            }
        });
        event7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SC = new Intent(Fineselect.this, SaladCarving.class);
                startActivity(SC);
                finish();
            }
        });
        event8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cart = new Intent(Fineselect.this, ClayArt.class);
                startActivity(Cart);
                finish();
            }
        });
        event9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bestShot = new Intent(Fineselect.this, Best_Shot.class);
                startActivity(bestShot);
                finish();
            }
        });
        event10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hobcoll = new Intent(Fineselect.this, HobbyCollection.class);
                startActivity(hobcoll);
                finish();
            }
        });
        event11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nailarting = new Intent(Fineselect.this, Nail_art.class);
                startActivity(nailarting);
                finish();
            }
        });
        event12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hairing = new Intent(Fineselect.this, Hairstyling.class);
                startActivity(hairing);
                finish();
            }
        });
        event13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tpaint = new Intent(Fineselect.this, Tshirtpainting.class);
                startActivity(tpaint);
                finish();
            }
        });
        event14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fp = new Intent(Fineselect.this, Face_Painting.class);
                startActivity(fp);
                finish();
            }
        });
        event15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cwf = new Intent(Fineselect.this, Cookwithoutfire.class);
                startActivity(cwf);
                finish();
            }
        });
        event16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sc = new Intent(Fineselect.this, Soapcarving.class);
                startActivity(sc);
                finish();
            }
        });
        event17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coll = new Intent(Fineselect.this, Collage_Making.class);
                startActivity(coll);
                finish();
            }
        });
        event18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(Fineselect.this, MovieMaking.class);
                startActivity(move);
                finish();
            }
        });
        event20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boos = new Intent(Fineselect.this, Bestoutofscrap.class);
                startActivity(boos);
                finish();
            }
        });




    }



    @Override
    public void onBackPressed() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainintent = new Intent(Fineselect.this, screen.class);
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
                Intent taketolit = new Intent(this,Litselect.class);
                startActivity(taketolit);
                break;
            case R.id.nav_FineNPic:
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