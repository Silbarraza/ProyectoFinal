package com.curso.android.app.practica.proyectofinal.view

import androidx.activity.viewModels
import com.curso.android.app.practica.proyectofinal.databinding.ActivityMainBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.curso.android.app.practica.proyectofinal.R

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        mainViewModel.compara.observe(this) {
            binding.textView.text = it.mensajeInicial
        }

        binding.button.setOnClickListener{
            var mensaje1 = binding.editTextText.getText().toString()
            var mensaje2 = binding.editTextText2.getText().toString()

            if(mensaje1 == mensaje2) {
                mainViewModel.textosIguales()
            }
            else {
                mainViewModel.textosDistintos()
            }

        }
    }
}