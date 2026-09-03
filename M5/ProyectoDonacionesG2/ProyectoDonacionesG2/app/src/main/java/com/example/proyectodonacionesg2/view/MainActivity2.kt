package com.example.proyectodonacionesg2.view

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectodonacionesg2.R
import com.example.proyectodonacionesg2.model.Donacion

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)


        var textView2 = findViewById<TextView>(R.id.textView2)
        textView2.text = Donacion.totalAmount.toString()


        var txtValorRecibido = findViewById<TextView>(R.id.txtValorRecibido)
        txtValorRecibido.setText(intent.getIntExtra("dato", 0).toString())


    }
}