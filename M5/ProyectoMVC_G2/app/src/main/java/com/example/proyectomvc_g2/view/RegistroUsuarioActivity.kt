package com.example.proyectomvc_g2.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectomvc_g2.R
import com.example.proyectomvc_g2.controller.UsuarioController

class RegistroUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro_usuario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btnGuardar = findViewById<Button>(R.id.btnGuardar)
        btnGuardar.setOnClickListener { guardarUsuario() }
    }

    fun guardarUsuario()
    {
        var txtRut = findViewById<EditText>(R.id.txtRut)
        var txtNombre = findViewById<EditText>(R.id.txtNombre)
        var txtCorreo = findViewById<EditText>(R.id.txtCorreo)
        var txtEdad = findViewById<EditText>(R.id.txtEdad)

        // validación de información

        if(txtRut.text.isEmpty())
        {
            txtRut.setError("Ingrese Rut")
            return
        }
        if(txtNombre.text.isEmpty())
        {
            txtNombre.setError("Ingrese Nombre")
            return
        }
        if(txtCorreo.text.isEmpty())
        {
            txtCorreo.setError("Ingrese Correo")
            return
        }
        if(txtEdad.text.isEmpty())
        {
            txtEdad.setError("Ingrese Edad")
            return
        }
        if(txtEdad.text.toString().toInt() < 1)
        {
            txtEdad.setError("Ingrese edad mayor a 0")
            return
        }

        //guardar usuario
        var usuarioController = UsuarioController()

        if(usuarioController.guardar(txtRut.text.toString(),
                                    txtNombre.text.toString(),
                                    txtCorreo.text.toString(),
                                    txtEdad.text.toString().toInt()))
        {
            txtRut.setText("")
            txtNombre.setText("")
            txtCorreo.setText("")
            txtEdad.setText("")
            txtRut.requestFocus()
            Toast.makeText(this, "Usuario Guardado", Toast.LENGTH_SHORT).show()
            println(usuarioController.imprimir())
        }
        else
            Toast.makeText(this, "Error al guardar usuario", Toast.LENGTH_SHORT).show()
/*
    Ejercicio: Definir los mensajes de texto en values string para que sirve en todos
    los idiomas configurados (es, en y fr)

    PPT M5 AE3: Ejercicio de donaciones.

 */
    }

}