package com.example.ejercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button accept;
    TextView result;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        accept = findViewById(R.id.aceptar);

        result = findViewById(R.id.resultado);

        nombre = findViewById(R.id.campoTexto);


        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("El nombre es"+nombre.getText());
            }
        });

    }
}