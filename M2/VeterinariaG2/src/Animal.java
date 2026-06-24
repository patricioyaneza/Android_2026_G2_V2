
public abstract class Animal implements Operaciones {
	protected String nombre;
	protected double peso;

	public Animal() {
		this.nombre = "";
		this.peso = 0;
	}
		
	public Animal(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void imprimir()
	{
		System.out.println("Nombre	: " + this.nombre);
		System.out.println("Peso	: " + this.peso);
	}

	public void emitirSonido()
	{
		System.out.println("Animal emite sonido");
	}
}
