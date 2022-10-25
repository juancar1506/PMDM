package com.example.viajes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    static String VIAJE =".";
    EditText fechaDatePicEditText;
    EditText fechaDatePicEditText2;
    Spinner destinoIda;
    Spinner destinoVuelta;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fechaDatePicEditText = findViewById(R.id.FechaDestino);
        fechaDatePicEditText2= findViewById(R.id.FechaSalida);
        destinoIda=findViewById(R.id.SpinIda);
        destinoVuelta=findViewById(R.id.SpinDestino);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.LugaresIda, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        destinoIda.setAdapter(adapter);
        destinoVuelta.setAdapter(adapter);
        fechaDatePicEditText.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });

        fechaDatePicEditText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enviar = new Intent(getApplicationContext(), verDatos.class);
                Viaje datos = new Viaje();
                Bundle miBundle = new Bundle();
                miBundle.putSerializable(VIAJE,datos);
                enviar.putExtras(miBundle);
                startActivity(enviar);
            }
        });
    }




    private void showDatePickerDialog() {
        DatePickerFragment newFragment = DatePickerFragment.newInstance(new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                // +1 because January is zero
                final String selectedDate = day + " / " + (month + 1) + " / " + year;
                fechaDatePicEditText.setText(selectedDate);
            }
        });
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }



}