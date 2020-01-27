package com.sip.pengenumroh;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class FavoritActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorit);
        getWindow().setBackgroundDrawableResource(R.drawable.bg_favorit);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent z = new Intent(FavoritActivity.this,DashboardActivity.class);
                        startActivity(z);
                        break;
                    case R.id.action_favorites:
                        //Toast.makeText(FavoritActivity.this, "Favorites", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_order:
                        Intent x = new Intent(FavoritActivity.this,PesananActivity.class);
                        startActivity(x);
                        break;
                    case R.id.action_profile:
                        Intent i = new Intent(FavoritActivity.this,AkunActivity.class);
                        startActivity(i);
                        break;}
                return true;
            }
        });
    }
}
