
public class Cuenta {
	// 1- Atributos
	private int numeroCuenta;
	private String titular;
	private double saldo;

	// 2- Constructores
	public Cuenta() {
		this.numeroCuenta = 0;
		this.titular = "";
		this.saldo = 0.0;
	}
	
	public Cuenta(int numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	// 3- getters y setters
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// 4- metodos personalizados
	public void mostrarInformacion() {
		System.out.println("Número de Cuenta	: " + numeroCuenta);
		System.out.println("Titular			: " + titular);
		System.out.println("Saldo			: " + saldo);
	}
	
	// girar dinero
	
	// depositar dinero	
	
	// resumen de transacciones o  estado de cuenta
}
