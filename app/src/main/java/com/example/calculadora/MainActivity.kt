package com.example.calculadora

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Sumar.setOnClickListener{
            val num1 = binding.numero1.text.toString().toDoubleOrNull()
            val num2 = binding.numero2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                binding.Resultado.text = (num1 + num2).toString()
            } else {
                binding.Resultado.text = "Error: Valores no válidos"
            }
        }

        binding.Restar.setOnClickListener{
            val num1 = binding.numero1.text.toString().toDoubleOrNull()
            val num2 = binding.numero2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                binding.Resultado.text = (num1 - num2).toString()
            } else {
                binding.Resultado.text = "Error: Valores no válidos"
            }
        }

        binding.Multiplicar.setOnClickListener{
            val num1 = binding.numero1.text.toString().toDoubleOrNull()
            val num2 = binding.numero2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                binding.Resultado.text = (num1 * num2).toString()
            } else {
                binding.Resultado.text = "Error: Valores no válidos"
            }
        }

        binding.Dividir.setOnClickListener{
            val num1 = binding.numero1.text.toString().toDoubleOrNull()
            val num2 = binding.numero2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    binding.Resultado.text = (num1 / num2).toString()
                } else {
                    binding.Resultado.text = "Error: División por cero"
                }
            } else {
                binding.Resultado.text = "Error: Valores no válidos"
            }
        }
    }
}