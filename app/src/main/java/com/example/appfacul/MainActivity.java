package com.example.appfacul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamarLogin(View view) {
        Intent intentLogin = new Intent(this, LoginActivity.class);
        startActivity(intentLogin);
    }

    public void chamarCadastro(View view) {
        Intent intentCadastro = new Intent(this, CadastroActivity.class);
        startActivity(intentCadastro);
    }

    public void chamarSobre(View view) {
        Intent intentSobre = new Intent(this, SobreActivity.class);
        startActivity(intentSobre);
    }
}