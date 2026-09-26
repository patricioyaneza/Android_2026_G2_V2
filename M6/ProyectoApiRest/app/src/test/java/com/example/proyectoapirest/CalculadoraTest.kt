package com.example.proyectoapirest

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class CalculadoraTest {

    private lateinit var calculadora : Calculadora

    @Before
    fun setUp() {
        calculadora = Calculadora()
        calculadora.numero1 = 0
        calculadora.numero2 = 0
        println("Configuración de la prueba")
    }
    @After
    fun tearDown() {
        println("La prueba fue ejecutada con éxito")
    }
    @Test
    fun sumar_dosNumerosPositivos() {
        println("Inicio de prueba")
        calculadora.numero1 = 5
        calculadora.numero2 = 3
        val resultado = calculadora.sumar()
        assertEquals(8, resultado)
        println("Fin de prueba")
    }
    @Test
    fun sumar_dosNumerosNegativos() {
        calculadora.numero1 = -5
        calculadora.numero2 = -3
        val resultado = calculadora.sumar()
        assertEquals(-8, resultado)
    }
/*
Agregar en la clase Calculadora un método para restar, dividir y multimplicar los números.
Aplicar 4 pruebas a cada metodo
 */


}