package com.example.proyectokotlinciclovida

import android.os.Bundle
import android.util.Log
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
import com.example.proyectokotlinciclovida.ui.theme.ProyectoKotlinCicloVidaTheme

class MainActivity : ComponentActivity() {
    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoKotlinCicloVidaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        Log.d("Ciclo de Vida", "Método ejecutado onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo de Vida", "Método ejecutado onStart")
        contador++ // contador = contador + 1
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de Vida", "Método ejecutado onResume")
        contador++
        Log.d("Ciclo de Vida", "Contador: " + contador)
    }
    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de Vida", "Método ejecutado onPause")
        contador++
    }
    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de Vida", "Método ejecutado onStop")
        contador++
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de Vida", "Método ejecutado onRestart")
        contador++
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de Vida", "Método ejecutado onDestroy")
        Log.d("Ciclo de Vida", "Contador: " + contador)
    }
}
// Ejercicio: Crear un proyecto nuevo "EjercicioKotlin02", agregar un Login y un pantalla de bienvenida.
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
    ProyectoKotlinCicloVidaTheme {
        Greeting("Android")
    }
}