package com.sip.pengenumroh;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {

    private static int splashInterval = 3000;
    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mProgress = (ProgressBar) findViewById(R.id.progresBar1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //doWork();
                // TODO Auto-generated method stub
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }

            private void finish() {
                // TODO Auto-generated method stub
            }
        }, splashInterval);
    }
}
