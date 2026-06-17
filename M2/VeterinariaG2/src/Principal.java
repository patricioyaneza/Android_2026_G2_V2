import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1 = new Perro("Milo", 5.7, "Salchicha");		
		perro1.imprimir();
		
		// super clase = Sub clase
		Animal perro2 = new Perro("Cachupin", 20.5, "Galgo");
		perro2.imprimir();
		
		
		System.out.println("\n");
		Gato gato1 = new Gato("Michi", 10.3, true);
		gato1.imprimir();
		
		Animal gato2 = new Gato();
				
		perro1.emitirSonido();
		gato1.emitirSonido();
		
		// Crea el ArrayList
		ArrayList<Animal> veterinaria = new ArrayList<Animal>();
		
		// mascotas por agregar
		Perro p1 = new Perro("Benji", 20, "golden");
		Perro p2 = new Perro("ayudante de santa", 30, "San Bernardo");
		Perro p3 = new Perro("Scrapy", 5, "pug");
		
		Gato g1 = new Gato("bola de nieve I", 10, true);
		Gato g2 = new Gato("bola de nieve II", 12, true);
		
		// agregar mascotas a la coleccion (arraylist)
		veterinaria.add(p1);
		veterinaria.add(p2);
		veterinaria.add(p3);
		veterinaria.add(g1);
		veterinaria.add(g2);
		
		// muestra la cantidad de elementos actual de la coleccion
		System.out.println("cantidad de elementos: " + veterinaria.size() );
		
		// recorrer la colección
		for(Animal aux: veterinaria)
		{
			System.out.println("Nombre de la mascota: " + aux.getNombre());

		}
		
		
		
	}

}
