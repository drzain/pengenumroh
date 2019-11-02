package com.sip.pengenumroh;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AkunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);
        getWindow().setBackgroundDrawableResource(R.drawable.bg_akun);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigationakun);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.action_profile);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent i = new Intent(AkunActivity.this,DashboardActivity.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Toast.makeText(AkunActivity.this, "Favorites", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_order:
                        Intent x = new Intent(AkunActivity.this,PesananActivity.class);
                        startActivity(x);
                        break;
                    case R.id.action_profile:

                        break;}
                return true;
            }
        });

    }
}
