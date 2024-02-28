package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercice1 

{

	public static void main(String[] args)

	{
		// Creation d'une Liste de noms d'etudiants

		ArrayList<String> noms = new ArrayList<String>();

		// Ajouter des noms dans la Liste

		noms.add("Neury");
		noms.add("Frederic");
		noms.add("Meron");
		noms.add("Gerdon");
		noms.add("Ted");
		noms.add("Gloire");
		noms.add("Diop");
		noms.add("Moussa");
		noms.add("Paul");
		noms.add("Marie");
		noms.add("Dora");

		// Creation des iterator it et ip qui vont iterer sur notre Liste : noms

		Iterator<String> it = noms.iterator();

		Iterator<String> ip = noms.iterator();

		// Affichage de la Liste : noms avec un iterator it

		System.out.println("Affichage avant modification :");

		System.out.println(); // Pour l'espace du retour à la ligne
		System.out.println(); // Pour l'espace du retour à la ligne

		while (it.hasNext()) {
			System.out.print(it.next() + " | ");
		}

		// Modification de la valeur à l'index 5

		noms.set(5, "Arthur");

		// Affichage apres modification

		System.out.println(); // Pour l'espace du retour à la ligne
		System.out.println(); // Pour l'espace du retour à la ligne

		System.out.println("Affichage apres modification :");

		System.out.println(); // Pour l'espace du retour à la ligne
		System.out.println(); // Pour l'espace du retour à la ligne

		while (ip.hasNext()) {
			System.out.print(ip.next() + " | ");
		}

	}

}
