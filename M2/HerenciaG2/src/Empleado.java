
public class Empleado extends Persona {
	// Ejercicio: Completar la clase Empleado
	// crear 2 empleados en el main usando constructor con y sin parametros
	
	private int sueldo;
	private double comision;
	private String cargo;

	public Empleado() {
		super("", "", "");
		this.sueldo = 0;
		this.comision = 0;
		this.cargo = "";
	}
		
	public Empleado(String rut, String nombreCompleto, String direccion, int sueldo, double comision, String cargo) {
		super(rut, nombreCompleto, direccion);
		this.sueldo = sueldo;
		this.comision = comision;
		this.cargo = cargo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void imprimirDatos()
	{
		super.imprimirDatos();
		System.out.println("Sueldo			: " + this.sueldo);
		System.out.println("Comision		: " + this.comision);
		System.out.println("Cargo			: " + this.cargo);
	}
	
}
