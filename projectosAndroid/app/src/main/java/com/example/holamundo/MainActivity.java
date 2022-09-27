package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        TextView text = findViewById(R.id.textView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = (int) (0xFF00FF * (Math.random()* 100));
                int colorBoton = (int) (0xFF5511 * (Math.random() *200));
                v.getRootView().setBackgroundColor(color);
                v.setBackgroundColor(colorBoton);
                text.setTextColor(colorBoton);

            }
        });

    }



}