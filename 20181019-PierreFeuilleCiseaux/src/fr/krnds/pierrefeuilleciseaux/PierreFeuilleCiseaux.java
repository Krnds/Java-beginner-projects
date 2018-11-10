package fr.krnds.pierrefeuilleciseaux;

public class PierreFeuilleCiseaux {

	public static void main(String[] args) {

		// Choix humain
		char choixHuman;
		String human = "";

		do {

			System.out.println("Rentrez votre choix ([p]ierre, [f]euille, [c]iseaux)");
			choixHuman = Terminal.lireChar();

			if (choixHuman == 'p') {
				human = "pierre";
			} else if (choixHuman == 'f') {
				human = "feuille";
			} else if (choixHuman == 'c') {
				human = "ciseaux";
			} else {
				System.out.println("erreur");
			}

		} while (choixHuman != 'p' && choixHuman != 'f' && choixHuman != 'c');
		
		// Choix ordinateur
		String[] elements = { "pierre", "feuille", "ciseaux" };
		int rangListe = (int) (Math.random() * 3);

		String comp = elements[rangListe];
		System.out.println("human : " + human + " " + "computer : " + comp);

		// Comparaison humain/ordinateur
		if (comp.equals(human)) {
			System.out.println("égalité");
		} else if ((comp.equals("pierre") && human.equals("feuille"))
				|| (comp.equals("ciseaux") && human.equals("pierre"))
				|| (comp.equals("feuille") && human.equals("ciseaux"))) {
			System.out.println("human gagnant");
		} else {
			System.out.println("computer gagnant");
		}

	}
}

//TODO si deux caracères sont mis, renvoie une erreur
//TODO demander à l'utilisateur si il veut continuer
//TODO inclure une boucle
//TODO accepter les minuscules/majuscules si l'utilisateur rentre p/f/c'