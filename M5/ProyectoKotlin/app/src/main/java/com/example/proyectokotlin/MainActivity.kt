package com.example.proyectokotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectokotlin.ui.theme.ProyectoKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoKotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
            System.out.println("Hola Mundo!!! (JAVA)")
            println("Hola Mundo!!!")

            val persona = Persona(1000, "Pedro", "Diaz", "p@email.cl")
            println(persona)
            println(persona.nombre)
            persona.nombre = "Juan"
            println(persona.nombre)
            println(persona.toString())

            val vehiculo = Vehiculo("ABC123", "Toyota", "Corolla", 2022)
            println(vehiculo)
            println(vehiculo.patente)
            vehiculo.patente = "DEF456"
            println(vehiculo.patente)

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoKotlinTheme {
        Greeting("Android")
    }
}