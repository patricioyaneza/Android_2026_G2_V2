package com.example.proyectodonacionesg2.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectodonacionesg2.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_menu)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(Intent(this, DonationActivity::class.java))
        }

        binding.btnLista1.setOnClickListener {
            startActivity(Intent(this, Lista1Activity::class.java))
        }

        binding.btnLista2.setOnClickListener {
            startActivity(Intent(this, Lista2Activity::class.java))
        }

        binding.btnLista3.setOnClickListener {
            startActivity(Intent(this, Lista3Activity::class.java))
        }
    }
}