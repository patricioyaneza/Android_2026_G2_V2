package com.example.proyectocorutinag2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectocorutinag2.databinding.ActivityMain2Binding

import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAumentar.setOnClickListener {
            //Thread.sleep(3000)
            binding.txtContador.text = (++contador).toString()
        }
        binding.btnSolicitar.setOnClickListener {
            binding.txtMensaje.text = "Iniciado solicitud"

            lifecycleScope.launch {
                delay(10000)
                binding.txtMensaje.text = "Solicitud Finalizada"
            }
        }

    }
}