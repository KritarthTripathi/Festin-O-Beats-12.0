package com.abesit.amritotsavabesit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.abesit.amritotsavabesit.R;
import com.google.android.material.navigation.NavigationView;

public class screen extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ConstraintLayout cL1;

    CardView Cview1, Cview2, Cview3, Cview4;
    ScrollView Sview;
    LinearLayout first2cards, next2cards;
    Toolbar toolbar;
    TextView textView, textView2, textView5, textView6;
    ImageView imageView3, imageView4;

    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        CardView Cview1 = findViewById(R.id.cview1);
        CardView Cview2 = findViewById(R.id.cview2);
        CardView Cview3 = findViewById(R.id.cview3);
        CardView Cview4 = findViewById(R.id.cview4);

        ConstraintLayout cL1 = findViewById(R.id.cL1);

        DrawerLayout drawerLayout = findViewById(R.id.Dlayout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        Toolbar toolbar = findViewById(R.id.toolbar);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);

        ScrollView Sview = findViewById(R.id.Sview);

        LinearLayout first2cards = findViewById(R.id.first2cards);
        LinearLayout next2cards = findViewById(R.id.next2cards);

        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);

        Cview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cultselectlist = new Intent(screen.this, CulturalselectActivity.class);
                startActivity(cultselectlist);
                finish();
            }
        });

        Cview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent techselectlist = new Intent(screen.this, Techselect.class);
                startActivity(techselectlist);
                finish();
            }
        });

        Cview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent litsellist = new Intent(screen.this, Litselect.class);
                startActivity(litsellist);
                finish();

            }
        });


        Cview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finesellist = new Intent(screen.this, Fineselect.class);
                startActivity(finesellist);
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

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            //super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.nav_home:
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
                Intent i = new Intent(this,Teams.class);
                startActivity(i);
                break;

        }


        return true;
    }
}