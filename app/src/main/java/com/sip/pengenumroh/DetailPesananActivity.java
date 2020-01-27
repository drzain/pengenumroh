package com.sip.pengenumroh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailPesananActivity extends AppCompatActivity {

    Button belipaket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pesanan);

        belipaket = (Button) findViewById(R.id.beliPaket);
        belipaket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailPesananActivity.this,OrderActivity.class);
                startActivity(i);
            }
        });
    }
}
