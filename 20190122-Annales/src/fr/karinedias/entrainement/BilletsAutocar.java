package fr.karinedias.entrainement;

import fr.karinedias.annales.Terminal;

public class BilletsAutocar {

	public static void main(String[] args) {
		// From :
		// http://deptinfo.cnam.fr/Enseignement/CycleA/APA/nfa032/docs/chapitre-introduction.pdf
		// 1.7. exercice 1.1.1.

		double[] prixTab = { 3.20, 1.80, 2.30, 4.20, 5 };
		String[] villesTab = { "Vierzon", "Salbis", "Nouans", "LB", "LFSA", "Orleans" };

		for (int i = 0; i < 2; i++) {
			System.out.println(getVilles(villesTab)[i]);
		}

	}

	public static int indiceVille(String ville, String[] tableau) {

		int indice = -1;

		for (int i = 0; i < tableau.length; i++) {
			if ((ville).equals(tableau[i])) {
				indice = i;
				break;
			} else {
				throw new RuntimeException(
						"La ville spécifiée n'est pas comprise dans le trajet de l'autocar. Veuillez rentrer une autre ville svp : ");
			}
		}
		return indice;
	}

	public static String[] getVilles(String[] tableau) {

		boolean found = false;
		boolean saisieDepart = false;
		String villedepart, villearrivee, depart = "partir", retour = "arriver";
		String[] voyage = new String[2];

		if (!saisieDepart) {
			// départ et arrivée non soumis
			System.out.println("Depuis quelle ville souhaitez-vous " + depart + " ?");
		} if (saisieDepart) {
			// ville de départ spécifiée mais arrivée non
			System.out.println("Depuis quelle ville souhaitez-vous " + retour + " ?");
		}
		do {
			// affichage du choix des villes
			System.out.println("Vous avez le choix entre : ");
			for (int i = 0; i < tableau.length; i++) {
				System.out.println(" - " + tableau[i].toString());
			}
			if (!saisieDepart) {
				villedepart = Terminal.lireString();
				for (int i = 0; i < tableau.length; i++) {
					if (villedepart.equals(tableau[i])) {// NE FONCTIONNE pas !
						voyage[0] = villedepart;
						saisieDepart = true;
						found = true;
					}

				}
			} else if (saisieDepart) {
				villearrivee = Terminal.lireString();
				for (int i = 0; i < tableau.length; i++) {
					if (villearrivee.equals(tableau[i])) {
						voyage[1] = villearrivee;
						found = true;
					}
				}

			}

		} while (!found);

		return voyage;
	}

}

//String[] tableau = new String[2];
//String[] villes = { "Paris", "Bordeaux", "Lyon", "Marseille", "Nantes", "Besançon" };
//boolean found = false;
//String villedepart = "Nantes";
//String villearrivee = "Besançon";
//
//do {
//
//	for (int i = 0; i < villes.length; i++) {
//		if (villedepart != villes[i]) {
//			found = true;
//			break;
//		}
//	}
//	System.out.println(found);
//} while (!found);
