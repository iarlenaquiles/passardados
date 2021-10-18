package com.aquiles.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                // instanciar objeto
                Usuario user = new Usuario("ronaldo", "iarlen@gmail.com");

                //passar dados
                intent.putExtra("nome", "Iarlen");
                intent.putExtra("idade",27);
                intent.putExtra("objeto", user);

                startActivity(intent);
            }
        });
    }
}