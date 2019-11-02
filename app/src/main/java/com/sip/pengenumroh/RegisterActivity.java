package com.sip.pengenumroh;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {

    Button btnDaftar;
    EditText fullname, email, phone, pass, repass;
    String txtFullname, txtEmail, txtPhone, txtPass, txtRepass;
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getWindow().setBackgroundDrawableResource(R.drawable.background);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        btnDaftar = (Button) findViewById(R.id.buttonDaftar);
        fullname = (EditText) findViewById(R.id.fullname);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        pass = (EditText) findViewById(R.id.password);
        repass = (EditText) findViewById(R.id.password2);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    //new daftarUser().execute();
                    // startActivity(new Intent(RegistrationForm.this, Home.class));
                }
            }

            private boolean validate() {
                boolean temp=true;
                txtEmail = email.getText().toString();
                txtPass = pass.getText().toString();
                txtRepass = repass.getText().toString();
                if(!EMAIL_ADDRESS_PATTERN.matcher(txtEmail).matches()){
                    Toast.makeText(RegisterActivity.this,"Invalid Email Address",Toast.LENGTH_SHORT).show();
                    temp=false;
                }
                else if(!txtPass.equals(txtRepass)){
                    Toast.makeText(RegisterActivity.this,"Password Not matching",Toast.LENGTH_SHORT).show();
                    temp=false;
                }
                return temp;
            }
        });
    }

    public final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9+._%-+]{1,256}" +
                    "@" +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" +
                    "(" +
                    "." +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" +
                    ")+"
    );

}
