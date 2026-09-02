package com.example.proyectodonacionesg2.view

import android.os.Bundle
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectodonacionesg2.R
import com.example.proyectodonacionesg2.databinding.ActivityLista2Binding

class Lista2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityLista2Binding
    private val productos = mutableListOf(mapOf("nombre" to "", "precio" to "" ))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLista2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAgregar.setOnClickListener {
            val nombre = binding.txtNombreProducto.text.toString()
            val precio = binding.txtValor2.text.toString()
            if (nombre.isNotEmpty() && precio.isNotEmpty()) {
                productos.add(mapOf("nombre" to nombre, "precio" to precio))

                val adapter = SimpleAdapter(
                    this,
                    productos,
                    android.R.layout.simple_list_item_2,
                    arrayOf("nombre", "precio"),
                    intArrayOf(android.R.id.text1, android.R.id.text2)
                )
                binding.lista.adapter = adapter

                binding.txtNombreProducto.setText("")
                binding.txtValor2.setText("")
                binding.txtNombreProducto.requestFocus()

/*
Tarea de investigación:  Crear una nueva activity y buscar como
mostrar una lista con 3 columnas: Nombre | apellido | edad
*/
            }
        }

    }
}