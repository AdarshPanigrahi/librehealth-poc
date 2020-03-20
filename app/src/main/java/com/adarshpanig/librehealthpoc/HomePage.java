package com.adarshpanig.librehealthpoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        SearchView searchView = findViewById(R.id.search_bar1);
        searchView.setFocusable(false);

        BottomNavigationView bottomNavigationView =findViewById(R.id.nav_view);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               switch (menuItem.getItemId()){
                   case R.id.home:
                       return  true;
                   case R.id.drugs:
                       startActivity(new Intent(getApplicationContext(),DrugsPage.class));
                       overridePendingTransition(0,0);
                       return true;
                   case R.id.notifications:
                       startActivity(new Intent(getApplicationContext(),NotificationsPage.class));
                       overridePendingTransition(0,0);
                       return true;
                   case R.id.settings:
                       startActivity(new Intent(getApplicationContext(),SettingsPage.class));
                       overridePendingTransition(0,0);
                       return true;

               }

                return false;
            }
        });

          searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    Intent i = new Intent(HomePage.this,SearchHospital.class);
                    startActivity(i);
                } else {

                }
            }
        });


    }

}
