package com.example.davison.gasolinaealcool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextGasolina;
    private EditText editTextAlcool;
    private Button botaoCalcular;
    private TextView textExibir;
    private Button botaoSeguinte;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        botaoSeguinte = (Button) findViewById(R.id.botaoProx);
        editTextGasolina = (EditText) findViewById(R.id.editTextGasolina);
        editTextAlcool = (EditText) findViewById(R.id.editTextAlcool);
        botaoCalcular = (Button) findViewById(R.id.botaoCalcular);
        textExibir = (TextView) findViewById(R.id.textViewExibir);

        botaoSeguinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), segunda.class);
                i.putExtra("Nome", "Nilson");
                i.putExtra("qtdTurmas", 3);
                startActivity(i);
            }
        });

    }

    public void calcular(View view) {
        double gasolina = Double.parseDouble(editTextGasolina.getText().toString());
        double alcool = Double.parseDouble(editTextAlcool.getText().toString());

        String resultado = "A melhor opcao e: ";
        if((gasolina * 0.7) > alcool){
            resultado += "Alcool";
        }else {
            resultado += "Gasolina";
        }

        textExibir.setText(resultado);
    }
}
