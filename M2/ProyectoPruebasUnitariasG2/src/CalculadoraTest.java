import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private static Calculadora calc;
	@BeforeAll
	static void configuracionGeneral()
	{
		calc = new Calculadora();
	}
	
	@BeforeEach
	void configuracion()
	{
		System.out.println("configuración ejecutada.-");
	}
	
	@Test
	void sumarSoloNumerosPositivos()
	{
		System.out.println("Suma de calc: " + calc.sumar(10, 90));
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.sumar(2, 2);
		assertEquals(4, resultado);
	}

	@Test
	void sumarSoloNumerosNegativos()
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(-5, -3);
		assertEquals(-8, resultado);
	}
	

	@Test
	void sumarSoloPrimerNumeroEsPositivo()
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(5, -3);
		assertEquals(2, resultado);
	}

	@Test
	void sumarSoloSegundoNumeroEsPositivo()
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(-5, 3);
		assertEquals(-2, resultado);
	}
	

	@Test
	void restarSoloNumerosPositivos()
	{
		int resultado = calc.restar(20, 80);
		System.out.println("resultado" + resultado);
		assertEquals(-60, resultado);
	}
	// Ejercicios: crear 3 pruebas (escenarios) para la resta

	@Test
	void restarNumerosPositivosYNegativos() {	
		int resultado = calc.restar(-10,20);
		assertEquals(-30, resultado);
	}
	

	@Test
	void restarNumerosNegativos() {	
		int resultado = calc.restar(-10,-20);
		assertEquals(10, resultado, "resta de -10 a -20. Esperado 10");
	}

	@Test
	void multiplicarSoloNumerosNegativos() {
		Calculadora c = new Calculadora ();
		int resultado = c.multiplicar(-5,-8);
		assertTrue(resultado == 40, "verificar si numeros coinciden con el resultado");
	}

	@Test
	void multiplicarSoloPrimerNumeroNegativos() {
		Calculadora c = new Calculadora ();
		int resultado = c.multiplicar(-5,8);
		assertFalse(resultado == 40);
	}

	@Test
	void dividirSoloNumerosNegativos() {	
		Calculadora c = new Calculadora ();
		int resultado = c.dividir(-5,-1);
		assertEquals(5, resultado);
	}

	@Test
	void dividirSoloNumerospositivos() {		
		Calculadora c = new Calculadora ();
		int resultado = c.dividir(6,2);
		assertEquals(3, resultado);
	}
}
