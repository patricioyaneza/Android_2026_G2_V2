package com.example.proyectodonacionesg2.view

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.example.proyectodonacionesg2.databinding.ActivityLista1Binding

class Lista1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityLista1Binding
    private val textos = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLista1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAgregar.setOnClickListener {
            val texto = binding.txtValor.text.toString()
            if (texto.isNotEmpty()) {
                textos.add(texto)
                binding.lista.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, textos)
                binding.txtValor.setText("")
                binding.txtValor.requestFocus()
            }
        }

    }
}