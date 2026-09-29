package com.example.proyectoapirest

class Calculadora {
    var numero1 : Int = 0
    var numero2 : Int = 0

    fun sumar() : Int {
        return numero1 + numero2
    }
    fun restar() : Int {
        return numero1 - numero2
    }
    fun multiplicar() : Int {
        return numero1 * numero2
    }
    fun dividir() : Int {
        if(numero2 == 0)
            throw IllegalArgumentException("No se puede dividir por cero")
        return numero1 / numero2
    }

}