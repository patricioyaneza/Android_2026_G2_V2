package com.example.proyecto01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    Button btnSumar;
    EditText txtNumero1;
    EditText txtNumero2;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnSumar = findViewById(R.id.btnSumar);

        btnSumar.setOnClickListener(view -> {

            Toast.makeText(this, "Presionó el botón sumar", Toast.LENGTH_LONG).show();

        });
    }
}