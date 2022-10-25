package com.example.Layouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejerciciospmdm.R;

public class MainJuego extends AppCompatActivity {
    ImageButton piedra,papel, tijera;
    Button reset;

    ImageView jugadaUser, jugadaBot;

    TextView marcadorUser, marcadorBot;
    Thread play;
    int relojInterno =0;
    Usuario miUser;
    Bot miBot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_juego1);

        piedra = findViewById(R.id.piedra);
        papel = findViewById(R.id.papel);
        tijera = findViewById(R.id.tijera);
        reset = findViewById(R.id.reset);
        marcadorUser = findViewById(R.id.marcadorUser);

        marcadorBot = findViewById(R.id.marcadorBot);

        jugadaUser = findViewById(R.id.jugadaUser);

        jugadaBot = findViewById(R.id.jugadaBot);

        miBot = new Bot(R.id.papel,R.id.piedra,R.id.tijera,marcadorBot,jugadaBot);

        miUser = new Usuario(piedra,tijera,papel,marcadorUser,jugadaUser, miBot);

        miUser.start();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jugadaUser.setImageResource(0);
                jugadaBot.setImageResource(0);
                miUser.reset();
            }
        });



    }
}
