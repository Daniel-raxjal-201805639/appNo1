package com.example.actividadno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.*

class HipotenusaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hipotenusa2)

        val edValor1 = findViewById<EditText>(R.id.edValor1)
        val edValor2 = findViewById<EditText>(R.id.edValor2)
        val btncalcular = findViewById<Button>(R.id.btncalcular)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btncalcular.setOnClickListener {
            var cateto1 = edValor1.text.toString().toDouble()
            var cateto2 = edValor2.text.toString().toDouble()
                cateto1 = cateto1.pow(2)
                cateto2 = cateto2.pow(2)
            var hypo = (cateto1 + cateto2)
            hypo = sqrt(hypo)
            Toast.makeText(this, "La hipotenusa es: $hypo", Toast.LENGTH_SHORT).show()
            tvResultado.text = "La hipotenusa es: $hypo"
        }

    }
}