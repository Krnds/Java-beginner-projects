package fr.karinedias.entrainement;

import fr.karinedias.annales.Terminal;

public class Asupprimer {

	public static void Exo3ExoBoucle() {

		// for (int a = 0; a < 9; a++) {
		for (int i = 1; i < 9; i++) {
			for (int j = i; j < (i + 1); j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		// }

	}

	public static void main(String[] args) {
		// Exo3ExoBoucle();
		// deuxBouclesNombres();
		// System.out.println("Combien d'étoiles voulez-vous dessiner ?");
		// int etoiles = Terminal.lireInt();
		// demiLosange(etoiles);
		for (int i = 0; i < 10; i++) {

			for (char j = 'A'; j < 'K'; j++) {

				System.out.print(j);
				System.out.print(i + "  ");
			}
			Terminal.sautDeLigne();
		}
		Terminal.sautDeLigne();
		boucleNombre();
		
		String a = null;
		System.out.println(a);

	}

	public static void deuxBouclesNombres() {

		int nbLignes = 7;

		for (int i = 0; i < nbLignes; i++) {
			for (int j = 9; j >= 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void boucleNombre() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(j);
				System.out.print(i + "  ");
			}
			System.out.println();
		}
	}

	// //TODO:
	// *
	// **
	// ***
	// ****
	// *****
	// ****
	// ***
	// **
	// *

	public static void demiLosange(int maxEtoiles) {

		for (int j = 0; j <= maxEtoiles; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int j = 0; j <= maxEtoiles; j++) {
			for (int i = maxEtoiles - 1; i >= j; i--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void tabNombres() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j >= 10; j++) {
				System.out.print(j + "\t");
			}
			Terminal.sautDeLigne();
		}
	}
	
	
}
