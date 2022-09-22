package com.example.appfacul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.editTextEmail);
        senha = findViewById(R.id.editTextSenha);
        Button botaoLogin = findViewById(R.id.Login);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editEmail = email.getText().toString();
                String editSenha = senha.getText().toString();

                if (editEmail.isEmpty() || editSenha.isEmpty()){
                    ErroLogin();
                    //Snackbar.make(view, "Preencha o Email e Senha", Snackbar.LENGTH_SHORT).show();
                } else {
                    SucessoLogin();
                }

            }
        });
    }

    private void ErroLogin() {
        Intent intentErroLogin = new Intent(this, ErroLoginActivity.class);
        startActivity(intentErroLogin);
    }

    private void SucessoLogin() {
        Intent intentSucessoLogin = new Intent(this, SucessoLoginActivity.class);
        startActivity(intentSucessoLogin);
    }

}