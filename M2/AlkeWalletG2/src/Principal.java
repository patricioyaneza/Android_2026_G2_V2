import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta Billetera1 = new Cuenta(12345, "Juan Pérez", 1000.00);		
		Billetera1.mostrarInformacion();
		
		
		// Ejercicio 1: Crear otra billetera usado el constructor sin parámetros,
		// entregar datos(set) y mostrar su información.
		
		System.out.println("\n ===> OTRO TITULAR");
		Cuenta b2 = new Cuenta();
		b2.setNumeroCuenta(987654);
		b2.setTitular("Emilia");
		b2.setSaldo(600.589);

		b2.mostrarInformacion();
		
		// Ejercicio 2: Crear billetera3 solicitando los datos por teclado 
		// y mostrar su información.

		System.out.println("\n ===> 3er TITULAR");
		Scanner leerTeclado = new Scanner(System.in);
		Cuenta billetera3 = new Cuenta();
		
		System.out.print("\nIngrese el número de cuenta: ");
		int numeroCuenta = leerTeclado.nextInt();
		
		
		System.out.print("Ingrese el nombre del titular de la cuenta: ");
		
		// String titular = leerTeclado.next(); // permite leer solo una palabra
		leerTeclado.nextLine();
		String titular = leerTeclado.nextLine(); // permite leer una frase completa
		
		System.out.print("Ingrese el saldo de la cuenta: ");
		double saldo = leerTeclado.nextDouble();
		
		// traspasamos los datos a la billetera3 usando los setters
		billetera3.setNumeroCuenta(numeroCuenta);
		billetera3.setTitular(titular);
		billetera3.setSaldo(saldo);
		
		billetera3.mostrarInformacion();
		
	}

}
