
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
		
		System.out.println("El valor de pi es: " + numeroDecimal);
		
		// tarea: investigar los tipos de datos en Java
	}
	
}
