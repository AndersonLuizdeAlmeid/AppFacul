package com.example.appfacul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ErroLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro_login);
    }

    public void ChamarVoltar(View view) {
        Intent intentLogin = new Intent(this, LoginActivity.class);
        startActivity(intentLogin);
    }
}