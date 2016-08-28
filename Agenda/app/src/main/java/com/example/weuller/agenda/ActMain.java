package com.example.weuller.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class ActMain extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        btnAdicionar = (ImageButton) findViewById(R.id.btnAdicionar);

        //configurando ação ao clicar no botão
        btnAdicionar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //criando um objeto Intent para fazer a navegação para a próxima Activity
        //recebe como parametro a activity atual e a activity para a qual terá a navegação
        Intent it = new Intent(this, ActAdicionarContato.class);

        //metodo para iniciar a activity, recebe como parametro um intent
        startActivity(it);

    }
}
