package com.example.proyecto01;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MenuActivity extends AppCompatActivity {
    boolean open = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        FloatingActionButton fabPrincipal = findViewById(R.id.fabPrincipal);
        FloatingActionButton fabCalculadora = findViewById(R.id.fabCalculadora);
        FloatingActionButton fabOpcion1 = findViewById(R.id.fabOpcion1);

        fabPrincipal.setOnClickListener(view -> {
            if(open) {
                fabCalculadora.setVisibility(View.GONE);
                fabOpcion1.setVisibility(View.GONE);
            }
            else
            {
                fabCalculadora.setVisibility(View.VISIBLE);
                fabOpcion1.setVisibility(View.VISIBLE);
            }
            open = !open;
        });

        fabCalculadora.setOnClickListener(view -> {
            Intent intent = new Intent(this, CalculadoraActivity.class);
            startActivity(intent);
        });
         // Ejercicio 1: En la calculadora agregar un boton (imagen) que retorne al menu principal

    }

    @Override // muestra el menu creado
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item_Calculadora) {
            Intent intent = new Intent(this, CalculadoraActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.item_logout) {
            finishAffinity();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}