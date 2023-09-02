package com.curso.android.app.practica.proyectofinal.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.proyectofinal.model.ComparaTexto

class MainViewModel: ViewModel() {

    val compara: LiveData<ComparaTexto> get() = _compara
    private var _compara = MutableLiveData<ComparaTexto>(ComparaTexto("Para comparar presiona el botón"))

    fun textosIguales() {
        val mensaje = "Los textos son iguales"
        actualizarComp(mensaje)
    }

    fun textosDistintos() {
        val mensaje = "Los textos son diferentes"
        actualizarComp(mensaje)
    }

    private fun actualizarComp (mensaje: String) {
        _compara.value = ComparaTexto(mensaje)
    }

}