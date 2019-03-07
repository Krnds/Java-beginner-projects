package fr.karinedias.annales;

public class Annales2017 {

	public static int[] Exo21(int nombre) {

		int[] tab = new int[10];

		for (int i = 0; i < tab.length; i++) {
			if (nombre % nombre == 0) {
				tab[i] = i;
			}
		}
		return tab;
	}

	public static double Exo4ProgrammeTableaux() {

		int[] dispoStock = { 20, 10, 3, 15, 2, 17, 30 };
		double[] prixStock = { 60, 23, 50, 65, 89, 110, 22 };
		// un tableau avec la référence et la quantité
		int[][] panierCommande = new int[dispoStock.length][1];
		int i = 0, nbRef = 0, quantite = 0;
		double[] prixRef = new double[prixStock.length];
		double prixTotal = 0.0;
		boolean redo = false;
		do {
			System.out.println("Nombre de références à commander : ");
			try {
				nbRef = Terminal.lireInt();
			} catch (RuntimeException e) {
				System.out.println("Attention, le nombre doit être un entier.");
				redo = true;
			}
			if (nbRef > dispoStock.length || nbRef < 0) {
				System.out.println("Attention, le nombre de références doit être compris entre 1 et 7 compris.");
				redo = true;
			}
		} while (redo);

		// i est l'indice de la référence à commander.
		while (i < nbRef) {
			System.out.println("Veuillez rentrer la quantité souhaitée pour la référence n°" + (i + 1));

			panierCommande[i][quantite] = Terminal.lireInt();

			if (panierCommande[i][quantite] > dispoStock[i])
				throw new RuntimeException("Attention, la quantité souhaitée dépasse le stock disponible");
			else {
				prixRef[i] = panierCommande[i][quantite] * prixStock[i];
				// Le montant prixTotal n'existe plus en dehors de la boucle
				dispoStock[i] = dispoStock[i] - panierCommande[i][quantite];
			}
			i++;
		}

		for (int j = 0; j < prixRef.length; j++) {
			prixTotal = prixRef[j] + prixTotal;
		}
		afficherTab(panierCommande);

		return prixTotal;
	}

	public static void afficherTab(int[][] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[0].length; j++) {
				// System.out.println(tableau.toString() + " : ");
				System.out.print(tableau[i][j] + " ");

			}
			System.out.print("\n");
		}
	}

	public static void afficherTabSimple(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.print("[ " + tableau[i] + " ]");
		}
	}

	public static int indicePremRepet(int[] tableau) {

		int premRepet = 0;

		for (int i = 0; i < (tableau.length - 1); i++) {
			if (tableau[i] == tableau[i + 1]) {
				premRepet = i;
				break;
			}
		}

		return premRepet;
	}

	public static int indicePGEcart(int[] tableau) {

		int plusGrandEcart = 0;

		for (int i = 0; i < (tableau.length - 1); i++) {
			int comparaison = tableau[i + 1] - tableau[i];
			if (comparaison > plusGrandEcart) {
				plusGrandEcart = comparaison;
			}
		}

		return plusGrandEcart;
	}

	public static void main(String[] args) {
		// System.out.println("Votre prix final de la commande est de : " +
		// Exo4ProgrammeTableaux() + " €");

		int[] tab = { 4, 6, 8, 9, 0, 0, 1, 1, 1, 1, -4, 7, 9 };
		afficherTabSimple(tab);
		int i = 0;
		Terminal.sautDeLigne();
		while (i < tab.length) {
			System.out.print("    " + i);
			i++;
		}
		System.out.println("\n");
		System.out.println("L'indice de la première répétition est le " + indicePremRepet(tab));

		int[] ecarts = { 2, 1, 2, 0, 3, 3, 3, 5, 5, 5, 10, 11 };
		afficherTabSimple(ecarts);
		System.out.println("\nLe plus grand écart entre les indices de mon tableau est : " + indicePGEcart(ecarts));

	}
}
