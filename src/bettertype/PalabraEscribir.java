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
		palabras.add("�Qui�n es?");
		palabras.add("�rbol");
		palabras.add("Foca");
		palabras.add("Espa�a");
		palabras.add("#VamosAll�");
		palabras.add("1 y medio");
		palabras.add("show");
		palabras.add("�Genial!");
		palabras.add("Tigre");
		palabras.add("Videojuegos");
		palabras.add("Literatura");
		palabras.add("Bol�grafo");
		palabras.add("Matem�ticas");
		palabras.add("Austraila");
		palabras.add("Pelirroja");
		palabras.add("Mercadillo");
		palabras.add("Andaluc�a");
		palabras.add("Vacaciones");
		palabras.add("Murci�lago");
		palabras.add("Ahora");
		palabras.add("Hex�gono");
		palabras.add("B�ho");
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
