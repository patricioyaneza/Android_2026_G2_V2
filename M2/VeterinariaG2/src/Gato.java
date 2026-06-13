
public class Gato extends Animal {
	private boolean tieneVisionNoctura;

	public Gato() {
		super();
		this.tieneVisionNoctura = false;
	}
		
	public Gato(String nombre, double peso, boolean tieneVisionNoctura) {
		super(nombre, peso);
		this.tieneVisionNoctura = tieneVisionNoctura;
	}

	public boolean isTieneVisionNoctura() {
		return tieneVisionNoctura;
	}

	public void setTieneVisionNoctura(boolean tieneVisionNoctura) {
		this.tieneVisionNoctura = tieneVisionNoctura;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tiene visión nocturna :" + this.tieneVisionNoctura);
	}
	
	@Override
	public void emitirSonido()
	{
		System.out.println("Miau!!!");
	}
	
	
}
