package com.example.proyectodonacionesg2.view

import android.os.Bundle
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectodonacionesg2.R
import com.example.proyectodonacionesg2.databinding.ActivityLista3Binding

class Lista3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityLista3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuarios = listOf(
            mapOf("nombre" to "Juan", "apellido" to "Pérez", "correo" to "william@example.com"),
            mapOf("nombre" to "María", "apellido" to "García", "correo" to "john@example.com"),
            mapOf("nombre" to "Pedro", "apellido" to "López", "correo" to "henry@example.com"),
            mapOf("nombre" to "Ana", "apellido" to "Martínez", "correo" to "maria@example.com"),
            mapOf("nombre" to "Luis", "apellido" to "Hernández", "correo" to "jose@example.com"),
        )

        val adapter = SimpleAdapter(
            this,
            usuarios,
            R.layout.item_usuarios,
            arrayOf("nombre", "apellido", "correo"),
            intArrayOf(R.id.txtNombre, R.id.txtApellido, R.id.txtCorreo)
        )
        binding.listaUsuarios.adapter = adapter

    }
}