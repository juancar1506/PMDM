package com.example.segundaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView temp;
    Button play;
    Button stop;
    Button reset;
    Thread iniciar;
    boolean esPulsado=false;
    int min=0,seg=0,mili=0;
    Handler h= new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp = findViewById(R.id.contador);

        play = findViewById(R.id.play);

        stop = findViewById(R.id.stop);

        reset = findViewById(R.id.reiniciar);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                esPulsado = true;

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                esPulsado = false;
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp.setText("00:00:000");
                min=0;
                seg=0;
                mili=0;

            }
        });

        iniciar = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    if(esPulsado) {
                        try {
                            Thread.sleep(1);

                        } catch (Exception e) {
                            temp.setText("00:00:000");
                        }
                        mili++;
                        if (mili == 999) {
                            mili= 0;
                            seg++;
                        }

                        if (seg == 60) {
                            seg= 0;
                            min++;
                        }
                        h.post(new Runnable() {
                            @Override
                            public void run() {
                                String ml="",s="",m="";

                                if(min<10) m="0"+min;
                                else m=""+min;

                                if(seg<10) s="0"+seg;
                                else s=""+seg;

                                if(mili<10) ml="00"+mili;
                                else ml=""+mili;

                                if(mili<100) ml="0"+mili;
                                else ml=""+mili;


                                temp.setText(m+":"+s+":"+ml);
                            }
                        });

                    }
                }
            }
        });
        iniciar.start();

    }


}