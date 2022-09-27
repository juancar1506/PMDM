package com.example.contadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int cont_1=0, cont_2=0, cont_3=0, cont_4 = 0;

    int ContTotal =0;

    Button plusOne_1, plusOne_2, plusOne_3, plusOne_4;

    Button reset_1,reset_2, reset_3, reset_4;

    TextView visor_1, visor_2, visor_3 , visor_4;

    Button resetGlobal;

    TextView visorGlobal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusOne_1 = findViewById(R.id.plusOne_1);
        plusOne_2 = findViewById(R.id.plusOne_2);
        plusOne_3 = findViewById(R.id.plusOne_3);
        plusOne_4 = findViewById(R.id.plusOne_4);

        reset_1 = findViewById(R.id.reset_1);
        reset_2 = findViewById(R.id.reset_2);
        reset_3 = findViewById(R.id.reset_3);
        reset_4 = findViewById(R.id.reset_4);
        resetGlobal = findViewById(R.id.resetGlobal);

        visor_1 = findViewById(R.id.contador_1);
        visor_2 = findViewById(R.id.contador_2);
        visor_3 = findViewById(R.id.contador_3);
        visor_4 = findViewById(R.id.contador_4);
        visorGlobal = findViewById(R.id.contadorGlobal);


        resetGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor_1.setText("0");
                visor_2.setText("0");
                visor_3.setText("0");
                visor_4.setText("0");
                visorGlobal.setText("0");
                cont_1 = 0;
                cont_2 = 0;
                cont_3 = 0;
                cont_4 = 0;
                ContTotal = 0;
            }
        });

        plusOne_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont_1++;
                ContTotal++;
                visor_1.setText(""+cont_1);
                visorGlobal.setText(""+ContTotal);
            }
        });
        plusOne_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont_2++;
                ContTotal++;
                visor_2.setText(""+cont_2);
                visorGlobal.setText(""+ContTotal);
            }
        });
        plusOne_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont_3++;
                ContTotal++;
                visor_3.setText(""+cont_3);
                visorGlobal.setText(""+ContTotal);
            }
        });
        plusOne_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont_4++;
                ContTotal++;
                visor_4.setText(""+cont_4);
                visorGlobal.setText(""+ContTotal);
            }
        });

        reset_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContTotal = ContTotal - cont_1;
                cont_1 = 0;
                    visor_1.setText(""+cont_1);
                visorGlobal.setText(""+ContTotal);
            }
        });
        reset_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContTotal = ContTotal - cont_2;
                cont_2 = 0;
                visor_2.setText(""+cont_2);
                visorGlobal.setText(""+ContTotal);
            }
        });
        reset_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContTotal = ContTotal - cont_3;
                cont_3 = 0;
                visor_3.setText(""+cont_3);
                visorGlobal.setText(""+ContTotal);
            }
        });
        reset_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContTotal = ContTotal - cont_4;
                cont_4 = 0;
                visor_4.setText(""+cont_1);
                visorGlobal.setText(""+ContTotal);
            }
        });
    }
}