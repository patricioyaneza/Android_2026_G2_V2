
public class Vehiculo {

	// 1. Atributos
	private String patente;
	private String marca;
	private String modelo;
	private int anio;
	private boolean tieneAireAcondicionado;
	
	// 2. Constructores   new Vehiculo();
	public Vehiculo() {
		// Constructor sin parametro
		this.patente = "";
		this.marca = "";
		this.modelo = "";
		this.anio = 1980;
		this.tieneAireAcondicionado = false;
	}
	/*
	 new Vehiculo("ABC123", "Toyota", "Corolla", 2020, true);
	 Constructor con parametros que permite inicializar los atributos 
	 al momento de crear el objeto.
	*/
	
	public Vehiculo(String patente, String marca, String modelo, 
			int anio, boolean tieneAireAcondicionado) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}
	
	// 3. Getters y Setters  Accesores y Mutadores
	public String getPatente() {
		return patente;
	}
	
	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isTieneAireAcondicionado() {
		return tieneAireAcondicionado;
	}

	public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}
	
	// 4. Metodos Personalizados o customer
		
	
}
