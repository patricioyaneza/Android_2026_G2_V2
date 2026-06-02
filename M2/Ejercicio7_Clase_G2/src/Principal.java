
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
		
		
	}

}
