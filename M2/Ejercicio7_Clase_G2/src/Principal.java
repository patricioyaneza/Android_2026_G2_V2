
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner 
		
		System.out.println("***** Automotora Android ******");
		Vehiculo v1 = new Vehiculo();
		
		// mostrar la patente del vehiculo v1
		System.out.println("Patente: " + v1.getPatente());
		// modificar la patente del vehiculo v1
		v1.setPatente("ABCD12");
		
		System.out.println("Patente: " + v1.getPatente());
		// Ejercicio 1: asignar valores a los demas atributos 
		
		// asignar valores a los demas atributos del vehiculo v1
		v1.setMarca("Toyota");
		v1.setModelo("Corolla");
		v1.setAnio(2020);
		v1.setTieneAireAcondicionado(true);
		
		// mostrar los atributos del vehiculo v1
		System.out.println("Marca: " + v1.getMarca());
		System.out.println("Modelo: " + v1.getModelo());
		System.out.println("Año: " + v1.getAnio());
		System.out.println("Tiene Aire Acondicionado: " + v1.isTieneAireAcondicionado());
		
		// crear un nuevo vehiculo utilizando el constructor con parametros
		Vehiculo v2 = new Vehiculo("XYZ789", "Honda", "Civic", 2019, true);
		
		System.out.println("***** Vehiculo 2 *****");
		System.out.println("Patente: " + v2.getPatente());
		// Ejercicio 2: mostrar los datos de los atributos del vehiculo v2 
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Tiene Aire Acondicionado: " + v2.isTieneAireAcondicionado());
		// modificar la patente del vehiculo v2
		v2.setPatente("XYZ900");
		System.out.println("Patente: " + v2.getPatente());
		
		System.out.println("");
		System.out.println("");
		v1.mostrarDatos();
		v2.mostrarDatos();
		
		
	}

}
