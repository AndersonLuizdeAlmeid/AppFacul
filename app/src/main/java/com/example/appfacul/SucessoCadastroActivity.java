package com.example.appfacul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SucessoCadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso_cadastro);
    }

    public void ChamarSobre(View view) {
        Intent intentSobre = new Intent(this, SobreActivity.class);
        startActivity(intentSobre);
    }
}