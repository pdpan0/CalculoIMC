package com.pdpano.calculoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun atualizarResultado(view: View) {
        val altura: Double = findViewById<EditText>(R.id.inputAltura).text.toString().toDouble()
        val peso = findViewById<EditText>(R.id.inputPeso).text.toString().toDouble()

            findViewById<TextView>(R.id.resultadoIMC).apply {
                text = "Seu IMC é: ${calcularIMC(altura, peso)}"
            }
    }

    fun calcularIMC(altura: Double, peso: Double): Double {
        return peso/(altura*2)
    }
}