package com.example.proyectoalmacenamiento

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoalmacenamiento.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAceptar.setOnClickListener {
            val nombre = binding.txtNombre.text.toString()
            val apellido = binding.txtApellido.text.toString()
            val email = binding.txtEmail.text.toString()
            val celular = binding.txtCelular.text.toString()
            val sucursal = binding.txtSucursal.text.toString()

            val sp = getSharedPreferences("datos", MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("nombre", nombre).apply()
            editor.putString("apellido", apellido).apply()
            editor.putString("email", email).apply()
            editor.putString("celular", celular).apply()
            editor.putString("sucursal", sucursal).apply()

            Toast.makeText(this, "Datos guardados", Toast.LENGTH_SHORT).show()
        }

        binding.btnVer.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            startActivity(intent)
        }
    }
}