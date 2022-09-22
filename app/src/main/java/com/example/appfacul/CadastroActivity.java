package com.example.appfacul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText nomeCompleto;
    private EditText endereco;
    private EditText numero;
    private EditText cep;
    private EditText complemento;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nomeCompleto = findViewById(R.id.nomeCompleto);
        endereco = findViewById(R.id.endereco);
        numero = findViewById(R.id.numero);
        cep = findViewById(R.id.cep);
        complemento = findViewById(R.id.complemento);
        email = findViewById(R.id.email);
        Button botaoCadastrar = findViewById(R.id.cadastrar);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editNomeCompleto = nomeCompleto.getText().toString();
                String editEndereco = endereco.getText().toString();
                String editNumero = numero.getText().toString();
                String editCep = cep.getText().toString();
                String editComplemento = complemento.getText().toString();
                String editEmail = email.getText().toString();

                if (editEmail.isEmpty() || editNomeCompleto.isEmpty() || editEndereco.isEmpty() || editNumero.isEmpty() ||
                editCep.isEmpty() || editComplemento.isEmpty()){
                    ErroCadastro();
                    //Snackbar.make(view, "Preencha o Email e Senha", Snackbar.LENGTH_SHORT).show();
                } else {
                    SucessoCadastro();
                }
            }
        });
    }

    private void SucessoCadastro() {
        Intent intentSucessoCadastro = new Intent(this, SucessoCadastroActivity.class);
        startActivity(intentSucessoCadastro);
    }

    private void ErroCadastro() {
        Intent intentErroCadastro = new Intent(this, ErroCadastroActivity.class);
        startActivity(intentErroCadastro);
    }
}