package fr.karinedias.entrainement;

import java.util.Arrays;

import fr.karinedias.annales.Terminal;

public class Arrays2D {
	public static int[][] tableauDesVentes() {

		int[][] tabVentes = new int[6][5];
		String[] nomVendeur = { "Alain", "Béatrice", "Didier", "Evelyne", "Lucie", "Thomas" };
		String[] nomVoiture = { "Audi", "BMW", "Citroen", "Dacia", "Seat" };
		int vendeur = -1;
		boolean vendeurCorrect, voitureCorrecte;

		for (int i = 0; i < tabVentes.length; i++) {
			do {
				System.out.println("Quel est le numéro du vendeur " + nomVendeur[i] + " ?");
				try {
					vendeur = Terminal.lireInt();
				} catch (RuntimeException e) {
					System.out.println("Veuillez rentrer un entier svp.");
					vendeurCorrect = false;
				}
				vendeurCorrect = true;
			} while (!vendeurCorrect);

			tabVentes[i][0] = vendeur;
			for (int j = 0; j < tabVentes[0].length; j++) {
				do {
					System.out.println("Combien de " + nomVoiture[j] + " ont été vendues par " + nomVendeur[i] + " ?");
					try {
						tabVentes[i][j] = Terminal.lireInt();
					} catch (RuntimeException e) {
						System.out.println("Veuillez rentrer un entier svp.");
						voitureCorrecte = false;
					}
					voitureCorrecte = true;
				} while (!voitureCorrecte);
			}
		}

		return tabVentes;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.deepToString(tableauDesVentes()));
	}
}
