package com.example.Layouts;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejerciciospmdm.R;

import java.util.Random;

public class Bot {

    int marcador;

    int jugada1Id, jugada2Id,jugada3Id;
    TextView marcadorVista;

    ImageView jugada;

    Bot(int _jugada1,int _jugada2,int _jugada3,TextView _maracadorVista, ImageView _jugada) {
        this.jugada1Id = _jugada1;
        this.jugada2Id = _jugada2;
        this.jugada3Id = _jugada3;
        this.marcadorVista = _maracadorVista;
        this.jugada = _jugada;

    }

    private Jugadas getJugadas() {
        int JugadasBot = new Random().nextInt(Jugadas.values().length);
         return Jugadas.values()[JugadasBot];
    }

    public void victoria() {
        this.marcador++;
    }


    public int getMarcador() {
        return marcador;
    }

    public void reset() {
        this.marcador = 0;
        this.marcadorVista.setText("0");
        jugada.setImageResource(0);
    }

    public int  jugadaBot() {
        if (this.getJugadas() == Jugadas.PAPEL) {
            jugada.setImageResource(R.drawable.papel);
            return this.jugada1Id; //papel
        }

        if (this.getJugadas() == Jugadas.PIEDRA) {
            jugada.setImageResource(R.drawable.piedra);
            return  this.jugada2Id; //piedra
        }

        if (this.getJugadas() == Jugadas.TIJERA) {
            jugada.setImageResource(R.drawable.tijera);
            return  this.jugada3Id; //tijera
        }
        return  0;
    }



}
