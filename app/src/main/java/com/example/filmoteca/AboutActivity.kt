package com.example.filmoteca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.filmoteca.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_about)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            Toast.makeText(this, "Funcionalidad sin implementar", Toast.LENGTH_LONG).show()
        }
        val button2= findViewById<Button>(R.id.button1)
        button2.setOnClickListener{
            Toast.makeText(this, "Funcionalidad sin implementar", Toast.LENGTH_LONG).show()
        }
        val button3= findViewById<Button>(R.id.button2)
        button3.setOnClickListener{
            Toast.makeText(this, "Funcionalidad sin implementar", Toast.LENGTH_LONG).show()
        }
    }
}