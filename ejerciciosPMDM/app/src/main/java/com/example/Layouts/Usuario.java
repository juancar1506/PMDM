package com.example.Layouts;


import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejerciciospmdm.R;

public class Usuario {
    int marcador;

    int jugadaId;
    TextView marcadorVista;
    ImageButton jugada1;
    ImageButton jugada2;
    ImageButton jugada3;
    ImageView jugada;
    Bot miRival;
    Jugada jugadas;

    Usuario(ImageButton _jugada1, ImageButton _jugada2, ImageButton _jugada3, TextView _maracadorVista, ImageView _jugada,Bot _rival) {
        this.jugada1= _jugada1;
        this.jugada2 = _jugada2;
        this.jugada3 = _jugada3;
        this.marcadorVista = _maracadorVista;
        this.jugada = _jugada;
        this.miRival = _rival;
    }

    public void start() {
        this.jugadas = new Jugada(this.jugada1.getId(),this.jugada3.getId(),this.jugada2.getId()); // piedra papel tijera


        this.jugada1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jugada.setImageResource(R.drawable.piedra);
                jugadaId =  jugada1.getId();
                jugadas.setJugadaUser(jugadaId);
                jugadas.setJugadaBot(miRival.jugadaBot());
                if(jugadas.getResultado()==1) {
                    victoria();
                    marcadorVista.setText(""+getMarcador());
                }
                else if (jugadas.getResultado() == 2 ) {
                    miRival.victoria();
                }

            }
        });

        this.jugada2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jugada.setImageResource(R.drawable.tijera);
                jugadaId =  jugada2.getId();
                jugadas.setJugadaUser(jugadaId);
                jugadas.setJugadaBot(miRival.jugadaBot());
                if(jugadas.getResultado()==1) {
                    victoria();
                    marcadorVista.setText(""+getMarcador());
                }
                else if (jugadas.getResultado() == 2 ) {
                    miRival.victoria();
                    miRival.marcadorVista.setText(""+miRival.getMarcador());
                }
            }
        });

        this.jugada3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jugada.setImageResource(R.drawable.papel);
                jugadaId =  jugada3.getId();
                jugadas.setJugadaUser(jugadaId);
                jugadas.setJugadaBot(miRival.jugadaBot());
                if(jugadas.getResultado()==1) {
                    victoria();
                    marcadorVista.setText(""+getMarcador());
                }
                else if (jugadas.getResultado() == 2 ) {
                    miRival.victoria();
                    miRival.marcadorVista.setText(""+miRival.getMarcador());
                }

            }
        });

    }

    public int getMarcador() {
        return marcador;
    }

    public void victoria() {
        this.marcador++;
    }


    public void reset() {
        this.marcador = 0;
        this.marcadorVista.setText("0");
        this.miRival.reset();
        jugada.setImageResource(0);
    }

}
