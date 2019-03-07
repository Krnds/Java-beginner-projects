package fr.karinedias.exercicesclasses;

/**
 * @author karine
 *
 */

public class TestCompte {

	public static void main(String[] args) {

		Compte compte1 = new Compte("Bibi");
		Compte compte2 = new Compte("Titi");

		// Question 2 : opérations
		compte1.deposer(500);
		compte2.deposer(1000);
		compte2.retirer(10);
		compte1.virerVers(75, compte2);

		// Question 3 : tableau de dix comptes
		Compte[] tableauComptes = new Compte[10]; // déclaration

		for (int i = 0; i < tableauComptes.length; i++) {
			tableauComptes[i] = new Compte("Bibi"); // instanciation de l'objet Compte dans le tableau
		}

		for (int i = 0; i < tableauComptes.length; i++) {
			tableauComptes[i].deposer(200 + (100 * i));
			// virement de 20.- vers tous les autres comptes d'indice supérieur
			// (ex virer du compte 7 vers le 8 9 10)
			int sup = tableauComptes.length - i; // 10 - 5 = 5;
			System.out.println("\nIl reste " + sup + " compte(s) dont il faut faire le virement...\n");
			for (int j = 0; j < sup; j++) { // ici de 0 à 5 (comptes 5 à 10)
				tableauComptes[i].virerVers(20, tableauComptes[j]);
			}
			System.out.println("Voici le solde pour le compte n° " + (i + 1));
			tableauComptes[i].afficher();
			System.out.println(" €");
		}

	}

	/*
	 * Ensuite, vous ferez un virement de 20 euros de chaque compte vers chacun des
	 * comptes qui le suivent dans le tableau (par exemple, du compte d’indice 5, il
	 * faut faire des virements vers les comptes d’indice 6, 7, 8 et 9)
	 */
}
