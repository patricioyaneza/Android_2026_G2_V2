package com.example.proyectokotlin02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// Kotlin
        var btnAceptar = findViewById<Button>(R.id.btnAceptar)
        var txtEmail = findViewById<EditText>(R.id.txtEmail)
        var txtClave = findViewById<EditText>(R.id.txtClave)

        btnAceptar.setOnClickListener {
            var email = txtEmail.text.toString()
            var clave = txtClave.text.toString()

            if (email.isEmpty() || clave.isEmpty()) {
                Toast.makeText(this, "Debe ingresar email y clave", Toast.LENGTH_SHORT).show()
                txtEmail.requestFocus()
                return@setOnClickListener
            }
            // Guardar email en SharedPreferences
            var sp = getSharedPreferences("datosGuardados", MODE_PRIVATE)
            var editor = sp.edit()
            editor.putString("email", email).apply()
            editor.putInt("edad", 35).apply()



//            Toast.makeText(this, "Email: $email Clave: $clave", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)

        }

    }


}