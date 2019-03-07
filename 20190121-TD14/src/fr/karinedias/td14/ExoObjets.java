package fr.karinedias.td14;

import java.util.ArrayList;

public class ExoObjets {

	public static void main(String[] args) {
		// cf. http://deptinfo.cnam.fr/Enseignement/CycleA/APA/nfa031/docs/exercices-objets-1.pdf
		
		ArrayList<Double> listeNotes = new ArrayList<Double> (); //objet Double avec une majuscule. () permet l'appel du constructeur de la classe
		listeNotes.add(12.5);
		listeNotes.add(1, 9.0);
		listeNotes.add(17.0);
		
		listeNotes.size();
		

	}

}
