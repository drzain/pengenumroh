package com.sip.pengenumroh;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class PesananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        getWindow().setBackgroundDrawableResource(R.drawable.bg_pesan);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigationpesan);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.action_order);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent i = new Intent(PesananActivity.this,DashboardActivity.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Toast.makeText(PesananActivity.this, "Favorites", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_order:

                        break;
                    case R.id.action_profile:
                        Intent x = new Intent(PesananActivity.this,AkunActivity.class);
                        startActivity(x);
                        break;}
                return true;
            }
        });
    }
}
