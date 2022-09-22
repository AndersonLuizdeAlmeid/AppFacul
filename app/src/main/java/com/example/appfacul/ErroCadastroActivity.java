package com.example.appfacul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ErroCadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro_cadastro);
    }

    public void ChamarVoltar(View view) {
        Intent intentCadastro = new Intent(this, CadastroActivity.class);
        startActivity(intentCadastro);
    }
}