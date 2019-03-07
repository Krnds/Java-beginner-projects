package fr.karinedias.annales;

import java.util.ArrayList;
import java.util.Set;

public class DernierCours {

	public static void aligner(int[] tab, int nombre) {

		String[] tabsSt = new String[tab.length];

		int max = 0;

		for (int i = 0; i < tab.length; i++) {

		}

	}
	
	public static void afficherTableau (String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

	public static void main(String[] args) {
		String[] tab = new String[10];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = i + " ";
		}

		ArrayList<String> tab2 = new ArrayList<String>();
		for (int i = 0; i < tab2.size(); i++) {
			System.out.println("Veuillez écrire le contenu de la case " + i);
			tab2.add(Terminal.lireString());
		}
		
		tab2.set(0, "chaine");
		System.out.println(tab2.get(3));
		System.out.println(tab2.set(10, "salut"));
		System.out.println(tab2.remove(8));
		
	}
}
