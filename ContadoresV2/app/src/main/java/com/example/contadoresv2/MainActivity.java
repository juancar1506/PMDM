package com.example.contadoresv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int ContTotal =0;
    TextView visorGlobal;
    Button resetGlobal;
    FilaContador miFila;
    FilaContador miFila2;
    FilaContador miFila3;
    FilaContador miFila4;
    Thread t;
    List<FilaContador> filas;
    Handler h= new Handler();
    int relojInterno =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visorGlobal = findViewById(R.id.contadorGlobal);
        resetGlobal = findViewById(R.id.resetGlobal);

        miFila = new FilaContador (findViewById(R.id.contador_1), findViewById(R.id.plusOne_1), findViewById(R.id.reset_1));

        miFila2 = new FilaContador (findViewById(R.id.contador_2), findViewById(R.id.plusOne_2), findViewById(R.id.reset_2));

        miFila3 = new FilaContador (findViewById(R.id.contador_3), findViewById(R.id.plusOne_3), findViewById(R.id.reset_3));

        miFila4 = new FilaContador (findViewById(R.id.contador_4), findViewById(R.id.plusOne_4), findViewById(R.id.reset_4));

        filas = Arrays.asList(miFila,miFila2,miFila3,miFila4);
        for (FilaContador fila:filas) {
            fila.start();
        }

        resetGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (FilaContador fila:filas) {
                    fila.resetCont();
                }
            }
        });

        t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e ){
                        visorGlobal.setText("0");
                    }
                    relojInterno++;
                        ContTotal=miFila.getCont()+miFila2.getCont()+miFila3.getCont()+miFila4.getCont();

                    h.post(new Runnable() {
                        @Override
                        public void run() {
                            visorGlobal.setText(""+ContTotal);
                        }
                    });
                }
            }
        });

        t.start();

    }
}