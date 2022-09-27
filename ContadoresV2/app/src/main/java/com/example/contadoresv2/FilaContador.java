package com.example.contadoresv2;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class FilaContador implements Contador {
    TextView vista;
    Button contador;
    Button reset;
    int cont;

    public FilaContador(TextView _vista, Button _contador, Button _reset) {
        this.vista = _vista;
        this.contador = _contador;
        this.reset = _reset;
        this.cont = 0;
    }

    public int getCont() {
        return cont;
    }


    private void aumentarContador() {
        this.contador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont++;
                vista.setText(""+cont);
            }
        });
    }

    private void reiniciarTexto() {
        this.vista.setText("0");
    }

    @Override
    public void reiniciarContador() {
        this.reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont = 0;
                reiniciarTexto();
            }
        });
    }

    @Override
    public void resetCont() {
        cont = 0;
        reiniciarTexto();
    }

    @Override
    public void start() {
        reiniciarContador();
        this.aumentarContador();
    }
}
