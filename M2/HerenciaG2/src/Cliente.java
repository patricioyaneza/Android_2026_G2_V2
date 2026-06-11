
public class Cliente extends Persona {
	private int montoCredito;
	private String metodoPago;
	
	public Cliente() {
		// invoca constructor sin parametros de la clase persona
		super(); 
		this.montoCredito = 0;
		this.metodoPago = "";
	}

	public Cliente(String rut, String nombreCompleto, String direccion, int montoCredito, String metodoPago) {
		super(rut, nombreCompleto, direccion);
		this.montoCredito = montoCredito;
		this.metodoPago = metodoPago;
	}

	public int getMontoCredito() {
		return montoCredito;
	}

	public void setMontoCredito(int montoCredito) {
		this.montoCredito = montoCredito;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	
	@Override
	public void imprimirDatos()
	{
		System.out.println("Rut			: " + this.getRut());
		System.out.println("Nombre Completo		: " + this.getNombreCompleto());
		System.out.println("Dirección		: " + super.getDireccion());
		System.out.println("monto Credito		: " + this.montoCredito);
		System.out.println("metodo Pago		: " + this.metodoPago);		
	}
	
}
