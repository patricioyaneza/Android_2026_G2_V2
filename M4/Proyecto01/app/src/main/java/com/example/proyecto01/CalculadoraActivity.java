package com.example.proyecto01;

import android.os.Bundle;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class CalculadoraActivity extends AppCompatActivity {

    Button btnSumar;
    Button btnRestar;
    Button btnMultiplicar;
    Button btnDividir;
    Button btnLimpiar;
    EditText txtNumero1;
    EditText txtNumero2;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // asociar variables de la clase con los elementos de la vista
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnLimpiar = findViewById(R.id.btnLimpiar);

        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNuimero2);
        lblResultado = findViewById(R.id.lblResultado);

        btnSumar.setOnClickListener(view -> {
            int numero1 = Integer.parseInt(txtNumero1.getText().toString());
            int numero2 = Integer.parseInt(txtNumero2.getText().toString());
            int resultado = numero1 + numero2;
            txtNumero2.getWindowInsetsController().hide(WindowInsets.Type.ime());
            lblResultado.setText("Resultado: " + resultado);
            Toast.makeText(this, "Presionó el botón sumar", Toast.LENGTH_LONG).show();
        });

        // Ejercicio 1: Realizar las otras operaciones aritmeticas.
        btnRestar.setOnClickListener(view -> {
            int numero1 = Integer.parseInt(txtNumero1.getText().toString());
            int numero2 = Integer.parseInt(txtNumero2.getText().toString());
            int resultado = numero1 - numero2;
            txtNumero2.getWindowInsetsController().hide(WindowInsets.Type.ime()); // cierra el teclado
            lblResultado.setText("Resultado: " + resultado);
        });
        btnMultiplicar.setOnClickListener(view -> {
            int numero1 = Integer.parseInt(txtNumero1.getText().toString());
            int numero2 = Integer.parseInt(txtNumero2.getText().toString());
            int resultado = numero1 * numero2;
            txtNumero2.getWindowInsetsController().hide(WindowInsets.Type.ime()); // cierra el teclado
            lblResultado.setText("Resultado: " + resultado);
        });
        btnDividir.setOnClickListener(view -> {
            int numero1 = Integer.parseInt(txtNumero1.getText().toString());
            int numero2 = Integer.parseInt(txtNumero2.getText().toString());

            if (numero2 == 0) {
                Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_LONG).show();
                return;
            }

            int resultado = numero1 / numero2;
            txtNumero2.getWindowInsetsController().hide(WindowInsets.Type.ime()); // cierra el teclado
            lblResultado.setText("Resultado: " + resultado);

            new AlertDialog.Builder(this)
                    .setTitle("Resultado")
                    .setMessage("El resultado es: " + resultado)
                    .setPositiveButton("Aceptar", null)
                    //.setIcon(android.R.drawable.ic_dialog_info)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

        });
        btnLimpiar.setOnClickListener(view -> {
            txtNumero1.setText("");
            txtNumero2.setText("");
            lblResultado.setText("");
        });
        // Tarea 1: buscar las diferentes sintaxis de la sentencia if
        // Tarea 2: Agregar al IDE, una IA (gemini u otra que se pueda agregar)
    }
}