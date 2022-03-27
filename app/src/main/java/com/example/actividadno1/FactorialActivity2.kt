package com.example.actividadno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FactorialActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factorial2)

        val edValor1 = findViewById<EditText>(R.id.edValor1)
        val btncalcular = findViewById<Button>(R.id.btncalcular)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btncalcular.setOnClickListener {
         val respuesta = edValor1.text.toString().toInt()
            var num = 1
                for (i in respuesta downTo 1){
                    num *= i
                }
            Toast.makeText(this, "La respuesta es: $num", Toast.LENGTH_SHORT).show()
            tvResultado.text = "La respuesta es: $num"
        }
    }
}