package com.example.davison.aula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent it = getIntent();
        String nome = it.getStringExtra("nome");
        int qtdTurmas = it.getIntExtra("qtdTurmas", 0);
    }
}
