package com.example.infoviajes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=(Spinner)findViewById(R.id.spinnerIda);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.lugares, android.R.layout.simple_spinner_item);
    }

}
class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
    }
    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}