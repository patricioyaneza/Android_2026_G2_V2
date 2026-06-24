import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void sumarSoloNumerosPositivos()
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(10, 20);
		assertEquals(30, resultado);
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
	
	
}
