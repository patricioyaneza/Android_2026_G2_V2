
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1 = new Perro("Milo", 5.7, "Salchicha");		
		perro1.imprimir();
		
		// super clase = Sub clase
		Animal perro2 = new Perro("Cachupin", 20.5, "Galgo");
		
		System.out.println("\n");
		Gato gato1 = new Gato("Michi", 10.3, true);
		gato1.imprimir();
		
		Animal gato2 = new Gato();
		
		
		perro1.emitirSonido();
		gato1.emitirSonido();
	}

}
