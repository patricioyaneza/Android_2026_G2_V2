package com.example.proyectoalmacenamiento

import android.os.Bundle
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.example.proyectoalmacenamiento.data.AppDataBase
import com.example.proyectoalmacenamiento.databinding.ActivityGuardarSqliteBinding
import com.example.proyectoalmacenamiento.model.UsuarioModel
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch


class GuardarSqliteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuardarSqliteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuardarSqliteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAceptar.setOnClickListener {
            val nombre = binding.txtNombre.getText().toString()
            val apellido = binding.txtApellido.getText().toString()
            val email = binding.txtEmail.getText().toString()
            val celular = binding.txtCelular.getText().toString()
            val sucursal = binding.txtSucursal.getText().toString()

            // se debe validar que los campos no esten vacios entre otras validaciones

            lifecycleScope.launch {
                val usuario = UsuarioModel(
                    nombre = nombre,
                    apellido = apellido,
                    email = email,
                    celular = celular,
                    sucursal = sucursal
                )
                AppDataBase.getInstance(this@GuardarSqliteActivity).usuarioDao().insert(usuario)
                Toast.makeText(this@GuardarSqliteActivity, "Datos guardados", Toast.LENGTH_SHORT).show()

                binding.txtNombre.setText("")
                binding.txtApellido.setText("")
                binding.txtEmail.setText("")
                binding.txtCelular.setText("")
                binding.txtSucursal.setText("")
                binding.txtNombre.requestFocus()

                println("Datos de usuarios")
                val usuarios = AppDataBase.getInstance(this@GuardarSqliteActivity).usuarioDao().getAll()

                for (usuario in usuarios) {
                    println("Nombre de usuario ${usuario.nombre}")
                }


            }
        }
        /*
        Ejercicio / tarea: En un listView, mostrar nombre, apellido y sucursal de cada usuario.
        (1 layout -> linear layout horizontal y 3 textView)
         */
        binding.btnListar.setOnClickListener {
            lifecycleScope.launch {
                val usuarios = AppDataBase.getInstance(this@GuardarSqliteActivity).usuarioDao().getAll()
                val usuariosMap = usuarios.map { usuario ->
                    mapOf(
                        "nombre" to usuario.nombre,
                        "apellido" to usuario.apellido,
                        "email" to usuario.email
                    )
                }
                val adaptadorLista = SimpleAdapter(
                    this@GuardarSqliteActivity,
                    usuariosMap,
                    R.layout.filausuario,
                    arrayOf("nombre", "apellido", "email"),
                    intArrayOf(R.id.txtNombreFila, R.id.txtApellidoFila, R.id.txtEmailFila)
                )
                binding.listaUsuarios.adapter = adaptadorLista
            }
        }
    }
}