package com.example.ejerciciospmdm;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainLayout extends AppCompatActivity {

    EditText nombre,email,telefono;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouy_edittext);

        nombre = findViewById(R.id.nombre);
        email = findViewById(R.id.email);
        telefono = findViewById(R.id.telefono);

        result = findViewById(R.id.resultNombre);

        TextView.OnEditorActionListener manejador = new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i == EditorInfo.IME_ACTION_DONE) {
                    result.setText(String.format("Buenos dias\n "+ nombre.getText()+ " enseguida le mandaremos un correo a " +email.getText() +"\n y un mensaje a su numero: "+telefono.getText()));
                }


                return false;
            }
        };

        nombre.setOnEditorActionListener(manejador);
        email.setOnEditorActionListener(manejador);
        telefono.setOnEditorActionListener(manejador);

    }
}
