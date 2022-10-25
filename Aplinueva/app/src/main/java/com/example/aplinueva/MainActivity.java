package com.example.aplinueva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button enviar2;
    EditText Nombre;
    static String MENSAJE =".";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enviar2= findViewById(R.id.enviar2);
        Nombre = findViewById(R.id.editText);
        enviar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta2;
                intenta2 = new Intent(getApplicationContext(), MainActivity2.class);
                String mensaje= Nombre.getText().toString();
                intenta2.putExtra(MENSAJE,mensaje);
                startActivity(intenta2);
            }
        });
    }
}