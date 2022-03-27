package com.example.actividadno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class PotenciasActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_potencias2)

        val edValor1 = findViewById<EditText>(R.id.edValor1)
        val edValor2 = findViewById<EditText>(R.id.edValor2)
        val btnPotencia = findViewById<Button>(R.id.btnpotencia)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnPotencia.setOnClickListener {
            var num1 =1
                for (i in 1..edValor2.text.toString().toInt()){
                     num1 = (num1 * edValor1.text.toString().toInt())

                    Toast.makeText(this, "El número elevado es: $num1", Toast.LENGTH_SHORT).show()
                    tvResultado.text = "El número elevado es: $num1"
                }
        }

    }
}