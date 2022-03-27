package com.example.actividadno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class OperacionesActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operaciones2)

        /*asociar la lógica con los elementos de vista */
        val edValor1 = findViewById<EditText>(R.id.edValor1)
        val edValor2 = findViewById<EditText>(R.id.edValor2)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val btnRestar = findViewById<Button>(R.id.btnRestar)
        val btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
        val btnDivision = findViewById<Button>(R.id.btnDivision)
        val btnpromedio = findViewById<Button>(R.id.btnpromedio)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)


        btnSumar.setOnClickListener {
            //obtener los valores de las cajas de texto para realizar la operación y
            // mostrar el resultado en un mensaje u otro elemento
            val respuesta = edValor1.text.toString().toDouble() + edValor2.text.toString().toDouble();
            Toast.makeText(this,"La suma es: $respuesta" , Toast.LENGTH_LONG).show()
            tvResultado.text = "la suma es: $respuesta"
        }
        btnRestar.setOnClickListener {
            val respuesta = edValor1.text.toString().toDouble() - edValor2.text.toString().toDouble()
            Toast.makeText(this, "La resta es: $respuesta", Toast.LENGTH_SHORT).show()
            tvResultado.text = "La resta es: $respuesta"
        }
        btnMultiplicar.setOnClickListener {
            val respuesta = edValor1.text.toString().toDouble() * edValor2.text.toString().toDouble();
            Toast.makeText(this,"La multiplicacion es: $respuesta" , Toast.LENGTH_LONG).show()
            tvResultado.text = "la multilplicación es: $respuesta"


        }
        btnDivision.setOnClickListener {
            val respuesta = edValor1.text.toString().toDouble() / edValor2.text.toString().toDouble()
            Toast.makeText(this, "La division es: $respuesta", Toast.LENGTH_SHORT).show()
            tvResultado.text = "La division es: $respuesta"
        }
        btnpromedio.setOnClickListener {
            val respuesta = (edValor1.text.toString().toDouble() + edValor2.text.toString().toDouble())/2
            Toast.makeText(this, "El promedio es de: $respuesta", Toast.LENGTH_SHORT).show()
            tvResultado.text = "El promedio es de: $respuesta"
        }

    }
}