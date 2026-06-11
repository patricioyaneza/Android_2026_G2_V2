
public class Persona {
	private String rut;
	private String nombreCompleto;
	private String direccion;
	
	
	public Persona() {
		this.rut = "";
		this.nombreCompleto = "";
		this.direccion = "";
	}	
	
	public Persona(String rut, String nombreCompleto, String direccion) {
		this.rut = rut;
		this.nombreCompleto = nombreCompleto;
		this.direccion = direccion;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	// metodo imprimirDatos() debe mostrar por consola los valores de todos los atributos
	public void imprimirDatos()
	{
		System.out.println("Rut			: " + this.rut);
		System.out.println("Nombre Completo		: " + this.nombreCompleto);
		System.out.println("Dirección		: " + this.direccion);		
	}
	
	
}
