import java.util.Scanner;

public class Principal {

	// metodo
	// este metodo es el punto de arranque de la aplicación
	// entry point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		// crear una variable
		int numero = 10;
		int numero2;
		numero2 = 20;
		System.out.print("\nValor de la variable numero: ");
		System.out.println(numero);
		System.out.println(numero2);
		
		numero = 30;
		System.out.println(numero);
		System.out.println("Numero 2 vale: " + numero2 );
		
		// numero = "HOla"; // error de compilación, no se puede asignar un string a una variable de tipo int
		
		String nombre = "Juan ";
		String apellido;
		apellido = "Perez";
		
		// Ejercicio 1: mostrar el nombre completo
		System.out.print(nombre+apellido); // concatena strings (texto)
		System.out.println("\nSu nombre es: " + nombre + apellido);
		System.out.println("Su nombre es: " + nombre + " " + apellido);
		
		float numeroDecimal = 3.14159265f;
		double numeroDecimal2 = 3.14159265;
		System.out.println("El valor de pi es: " + numeroDecimal);
/*		
		int numeroPequeno = 1234567890123456789;
		long numeroGrande = 1234567890123456789L;
*/
		
		float valor = 3.123f;
		boolean valor2 = true;
		// tarea: investigar los tipos de datos en Java
		
		// permite leer el teclado. Importar la clase Scanner para poder usarla
		Scanner leerTeclado = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombreUsuario = leerTeclado.nextLine(); // captura el texto que escribe el usuario (String)  
		System.out.println("Hola " + nombreUsuario);
		
		
		System.out.print("Ingrese su 1er apellido: ");
		String apellidoUsuario = leerTeclado.next();
		System.out.println("Su 1er apellido: " + apellidoUsuario);

		// Ejercicio 3: solilcitar la edad y altura al usuario (int y float)
		
		System.out.print("Ingrese su edad: ");
		int edadUsuario = leerTeclado.nextInt();
		
		System.out.print("Ingrese su altura: ");
		float alturaUsuario = leerTeclado.nextFloat();
		
		System.out.println("Su edad es   : " + edadUsuario);
		System.out.println("Su altura es : " + alturaUsuario);

	}
	
}
