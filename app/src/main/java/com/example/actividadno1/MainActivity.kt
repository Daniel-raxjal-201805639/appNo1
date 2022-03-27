package com.example.actividadno1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnoperaciones = findViewById<Button>(R.id.btnoperaciones)
        val btnpotencia = findViewById<Button>(R.id.btnpotencia)
        val btnhipotenusa = findViewById<Button>(R.id.btnhipotenusa)
        val btnfactorial = findViewById<Button>(R.id.btnfactorial)
        val btncreditos = findViewById<Button>(R.id.btncreditos)

        btnoperaciones.setOnClickListener {

            Toast.makeText(this, "Operaciónes Básicas", Toast.LENGTH_SHORT).show()
            val operacionesBasicas: Intent = Intent(this, OperacionesActivity2::class.java)
            startActivity(operacionesBasicas)
        }

        btnpotencia.setOnClickListener {
            Toast.makeText(this, "Elevar a una Potencia", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, PotenciasActivity2::class.java)
            startActivity(intent)
        }
        btnhipotenusa.setOnClickListener {
            Toast.makeText(this, "Hipotenusa", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, HipotenusaActivity2::class.java)
            startActivity(intent)
        }
        btnfactorial.setOnClickListener {
            Toast.makeText(this, "Factorial", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, FactorialActivity2::class.java)
            startActivity(intent)
        }
        btncreditos.setOnClickListener {
            Toast.makeText(this, "Créditos", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, CreditosActivity2::class.java)
            startActivity(intent)
        }
    }
}