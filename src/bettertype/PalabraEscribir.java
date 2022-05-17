package bettertype;

import java.util.ArrayList;

public class PalabraEscribir {

	protected String palabra;

	public PalabraEscribir() {

		

	}

	public String getPalabra() {
		return palabra;
	}

	public void nuevaPalabra() {

		int random = (int) (0 + (Math.random() * 30));

		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("Gato");
		palabras.add("Perro");
		palabras.add("¿Quién es?");
		palabras.add("Árbol");
		palabras.add("Foca");
		palabras.add("España");
		palabras.add("#VamosAllá");
		palabras.add("1 y medio");
		palabras.add("show");
		palabras.add("¡Genial!");
		palabras.add("Tigre");
		palabras.add("Videojuegos");
		palabras.add("Literatura");
		palabras.add("Bolígrafo");
		palabras.add("Matemáticas");
		palabras.add("Austraila");
		palabras.add("Pelirroja");
		palabras.add("Mercadillo");
		palabras.add("Andalucía");
		palabras.add("Vacaciones");
		palabras.add("Murciélago");
		palabras.add("Ahora");
		palabras.add("Hexágono");
		palabras.add("Búho");
		palabras.add("Hacha");
		palabras.add("Dado");
		palabras.add("Loro");
		palabras.add("Sopa");
		palabras.add("Zapato");
		palabras.add("Bigote");
		palabras.add("Patata");

		this.palabra = palabras.get(random);
		
	}

}
