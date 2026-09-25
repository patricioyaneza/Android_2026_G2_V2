package com.example.proyectoapirest

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.proyectoapirest.data.network.JsonPlaceHolderClient
import com.example.proyectoapirest.databinding.ActivityPostBinding
import kotlinx.coroutines.launch

class PostActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerPosts.setOnClickListener {

            lifecycleScope.launch {
                try {
                    val respuesta = JsonPlaceHolderClient.instancia.getPosts()
                    val posts = respuesta.map { it.title }
                    
                    val adapter = ArrayAdapter(this@PostActivity, android.R.layout.simple_list_item_1, posts)
                    binding.listadoPost.adapter = adapter
                    Toast.makeText(this@PostActivity, "Datos Obtenidos", Toast.LENGTH_SHORT).show()
                }
                catch (e: Exception) {
                    Toast.makeText(this@PostActivity, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
                }

            }
        }

        binding.btnVerPostUsuario.setOnClickListener {
            val id = binding.editTextNumber.text.toString().toIntOrNull() ?: 0

            if(id < 1)
            {
                Toast.makeText(this@PostActivity, "El id ingresado no es válido", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            lifecycleScope.launch {
                try {
                    val respuesta = JsonPlaceHolderClient.instancia.getPostsByUserId(id)

                    val adapter = ArrayAdapter(
                        this@PostActivity,
                        android.R.layout.simple_list_item_1,
                        respuesta.map { it.title }
                    )
                    binding.listadoPost.adapter = adapter


                }
                catch (e: Exception) {
                    Toast.makeText(this@PostActivity, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }

        }


    }
}