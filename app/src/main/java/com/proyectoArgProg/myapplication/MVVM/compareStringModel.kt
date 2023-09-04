package com.proyectoArgProg.myapplication.MVVM

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


//MODEL
  data class compareStringModel( val texto: String, val mostrarTexto: String)

//VIEWMODEL
  class MainViewModel : ViewModel() {
    private val _resultado = MutableLiveData<String>()
    val resultado: LiveData<String> = _resultado

     fun compareStrings(texto1: String, texto2 : String) : String {

         val resultadoComparacion = if (texto1 == texto2) {
             "Son iguales!"
         } else {
             "Son distintos!"
         }
          _resultado.value = resultadoComparacion
         return resultadoComparacion
     }

}





