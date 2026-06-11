
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente();
		c1.setRut("1000");
		c1.setNombreCompleto("Juan Aros");
		c1.setDireccion("Av. Siempre Viva 178");
		c1.setMetodoPago("Crédito");
		c1.setMontoCredito(10000000);
		
		System.out.println("======== Información cliente 1 ========");
		c1.imprimirDatos();
		
		
		Cliente c2 = new Cliente("2000","Ana Pérez","Av Pajaritos 50", 5000000, "Cheque");
		System.out.println("\n======== Información cliente 2 ========");
		c2.imprimirDatos();
		
		
		Empleado e1 = new Empleado("100", "Ana", "Providencia 50", 500000, 2, "Vendedora");	
		System.out.println("\n======== Información Empleado 2 ========");
		e1.imprimirDatos();
	}

}
