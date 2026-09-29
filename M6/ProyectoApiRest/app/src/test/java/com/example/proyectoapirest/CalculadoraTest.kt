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
        val nombreMetodo = object {}.javaClass.enclosingMethod.name
        println("Fin de prueba: $nombreMetodo")
    }
    @Test
    fun sumar_dosNumerosNegativos() {
        calculadora.numero1 = -5
        calculadora.numero2 = -3
        val resultado = calculadora.sumar()
        assertEquals(-8, resultado)
    }
    @Test
    fun sumar_unNumeroPositivoYOtroNegativo() {
        calculadora.numero1 = 5
        calculadora.numero2 = -3
        val resultado = calculadora.sumar()
        assertEquals(2, resultado)
    }
    @Test
    fun sumar_dosNumerosCero() {
        calculadora.numero1 = 0
        calculadora.numero2 = 0
        val resultado = calculadora.sumar()
        assertEquals(0, resultado)
    }

    /*
    Agregar en la clase Calculadora un método para restar, dividir y multimplicar los números.
    Aplicar 4 pruebas a cada metodo
     */

    @Test
    fun restar_dosNumerosPositivos() {
        calculadora.numero1 = 5
        calculadora.numero2 = 3
        val resultado = calculadora.restar()
        assertEquals(2, resultado)
    }
    @Test
    fun restar_dosNumerosNegativos() {
        calculadora.numero1 = -5
        calculadora.numero2 = -3
        val resultado = calculadora.restar()
        assertEquals(-2, resultado)
    }
    @Test
    fun restar_unNumeroPositivoYOtroNegativo() {
        calculadora.numero1 = 5
        calculadora.numero2 = -3
        val resultado = calculadora.restar()
        assertEquals(8, resultado)
    }
    @Test
    fun restar_dosNumerosCero() {
        calculadora.numero1 = 0
        calculadora.numero2 = 0
        val resultado = calculadora.restar()
        assertEquals(0, resultado)
    }

    @Test
    fun multiplicar_dosNumerosPositivos() {
        calculadora.numero1 = 5
        calculadora.numero2 = 3
        val resultado = calculadora.multiplicar()
        assertEquals(15, resultado)
    }
    @Test
    fun multiplicar_dosNumerosNegativos() {
        calculadora.numero1 = -5
        calculadora.numero2 = -3
        val resultado = calculadora.multiplicar()
        assertEquals(15, resultado)
    }
    @Test
    fun multiplicar_unNumeroPositivoYOtroNegativo() {
        calculadora.numero1 = 5
        calculadora.numero2 = -3
        val resultado = calculadora.multiplicar()
        assertEquals(-15, resultado)
    }
    @Test
    fun multiplicar_dosNumerosCero() {
        calculadora.numero1 = 0
        calculadora.numero2 = 0
        val resultado = calculadora.multiplicar()
        assertEquals(0, resultado)
    }
    @Test
    fun dividir_dosNumerosPositivos() {
        calculadora.numero1 = 6
        calculadora.numero2 = 3
        val resultado = calculadora.dividir()
        assertEquals(2, resultado)
    }
    @Test
    fun dividir_dosNumerosNegativos() {
        calculadora.numero1 = -6
        calculadora.numero2 = -3
        val resultado = calculadora.dividir()
        assertEquals(2, resultado)
    }
    @Test
    fun dividir_unNumeroPositivoYOtroNegativo() {
        calculadora.numero1 = 6
        calculadora.numero2 = -3
        val resultado = calculadora.dividir()
        assertEquals(-2, resultado)
    }
    @Test
    fun dividir_elDivisorEsCero() {
        calculadora.numero1 = 10
        calculadora.numero2 = 0
        try {
            calculadora.dividir()
        } catch (e: IllegalArgumentException) {
            assertEquals("No se puede dividir por cero", e.message)
        }

    }
}