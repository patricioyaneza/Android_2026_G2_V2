import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio 4: Solicitar 2 numeros al usuario 
		/*
		int numero1 = 10;
		int numero2 = 5;
		*/
		
		Scanner leerTeclado = new Scanner(System.in);
	
		System.out.println("| ***** Calculadora G2 ***** |");
		
		System.out.print("Ingrese el primer numero: ");
		int numero1 = leerTeclado.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int numero2 = leerTeclado.nextInt();
		
		
		int resultadoSuma = numero1 + numero2;
		System.out.println("La suma es: " + resultadoSuma);		
		System.out.println("La resta es: " + (numero1 - numero2));
		
		/*
		 *  Ejercicio 5: Agregar la multiplicacion y la division.
		 */
		int resultadoMultiplicacion = numero1 * numero2;
		System.out.println("La multiplicacion es: " + resultadoMultiplicacion);
		
		double resultadoDivision = (double) numero1 / numero2;
		System.out.println("La division es: " + resultadoDivision);
	}

}
