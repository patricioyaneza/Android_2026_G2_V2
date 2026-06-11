
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente();
		c1.setRut("1000");
		c1.setNombreCompleto("Juan Aros");
		c1.setDireccion("Av. Siempre Viva 178");
		c1.setMetodoPago("Crédito");
		c1.setMontoCredito(10000000);
		
		c1.imprimirDatos();
	}

}
