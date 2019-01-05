package com.example.davison.aula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoSegunda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSegunda = (Button) findViewById(R.id.buttonID);
        botaoSegunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), segunda.class);
                i.putExtra("Nome", "Nilson");
                i.putExtra("qtdTurmas", 3);
                startActivity(i);
            }
        });
    }
}
