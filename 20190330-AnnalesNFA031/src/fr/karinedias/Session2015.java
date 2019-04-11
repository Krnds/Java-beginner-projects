package fr.karinedias;

import java.util.Scanner;
import fr.karinedias.utils.*;

public class Session2015 {

	public static void main(String[] args) {
		// exo3Q1(5);
		// exo3Q2();
		// exo3Q3();
		// exo4();
		Scanner sc = new Scanner(System.in);

		// System.out.println("Quelle est la lettre testée ?");
		// char c = sc.nextLine().charAt(0);
		// System.out.println("Fréquence de la lettre " + c + " : " + valeurLettre(c));

		char[] testJetons = {'T', 'R', 'S', 'A', 'A', 'E', 'C'};
		System.out.println("Quel est le mot choisi ?");
		String s = sc.nextLine();
		System.out.println(scoreMot(s));
		System.out.println(nombreLettresManquantes(s, testJetons));

	}

	public static void exo3Q1(int max) {

		for (int i = 0; i < max; i++) {
			for (int j = max - i; j <= max; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= max; i++) {
			for (int j = max - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void exo3Q2() {
		/*
		 * 00 10 20 30 40 50 60 70 80 90 01 11 21 31 41 51 61 71 81 91 02 12 22 32 42 52
		 * 62 72 82 92 03 13 23 33 43 53 63 73 83 93 04 14 24 34 44 54 64 74 84 94 05 15
		 * 25 35 45 55 65 75 85 95 06 16 26 36 46 56 66 76 86 96 07 17 27 37 47 57 67 77
		 * 87 97 08 18 28 38 48 58 68 78 88 98 09 19 29 39 49 59 69 79 89 99
		 */

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(j);
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void exo3Q3() {
		/*
		 * A0 B0 C0 D0 E0 F0 G0 H0 I0 J0 A1 B1 C1 D1 E1 F1 G1 H1 I1 J1 A2 B2 C2 D2 E2 F2
		 * G2 H2 I2 J2 A3 B3 C3 D3 E3 F3 G3 H3 I3 J3 A4 B4 C4 D4 E4 F4 G4 H4 I4 J4 A5 B5
		 * C5 D5 E5 F5 G5 H5 I5 J5 A6 B6 C6 D6 E6 F6 G6 H6 I6 J6 A7 B7 C7 D7 E7 F7 G7 H7
		 * I7 J7 A8 B8 C8 D8 E8 F8 G8 H8 I8 J8 A9 B9 C9 D9 E9 F9 G9 H9 I9 J9
		 */

		for (int i = 0; i < 10; i++) {
			for (char j = 'A'; j < ('A' + 10); j++) {
				System.out.print(j);
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void exo4() {

		String[] prenomsTab = new String[10];

		prenomsTab = new String[] { "Alizee", "Pierre", "Leon", "Sarah", "Agnes", "Sarah", "Pierre", "Pierre" };

		// Scanner sc = new Scanner(System.in);
		//
		// for (int i = 0; i < prenomsTab.length; i++) {
		// System.out.println("Quel est le prénom de l'enfant numéro " + (i + 1));
		// prenomsTab[i] = sc.nextLine();
		//
		// if (prenomsTab[i] == null || prenomsTab[i] == "\n" || prenomsTab[i] == " ") {
		// prenomsTab[i] = "coucou";
		// }
		// }
		// String[] prenomsTab = new String[10];
		//
		// Scanner sc = new Scanner(System.in);
		//
		// for (int i = 0; i < prenomsTab.length; i++) {
		// System.out.println("Quel est le prénom de l'enfant numéro " + (i + 1));
		// prenomsTab[i] = sc.nextLine();
		//
		// if (prenomsTab[i] == null || prenomsTab[i] == "\n" || prenomsTab[i] == " ") {
		// prenomsTab[i] = "coucou";
		// }
		// }
		// int i = 0;
		// System.out.println("\n\t Les prénoms des enfants : \n");
		// while (i < prenomsTab.length) {
		// if (prenomsTab[i] == null) {
		// prenomsTab[i] = "!";
		// }
		// i++;
		// }
		// int j = 0;
		// while (j < prenomsTab.length) {
		// System.out.println(prenomsTab[j]);
		// j++;
		// }

		// Nombre d'occurences pour chacun des prenoms du tableau :
		String[] prenomsTabCopy = prenomsTab.clone(); // copier le tableau de départ pour les comparaisons
		int[] occurences = new int[prenomsTab.length]; // pour stocker les nombres d'occurences

		for (int l = 0; l < prenomsTabCopy.length; l++) {
			for (int k = 0; k < prenomsTab.length; k++) {
				if (prenomsTabCopy[l].equals(prenomsTab[k])) {
					occurences[l] = (occurences[l] + 1);
				}
			}
		}

		// supprimer les doublons de prénoms :

		// TODO: à modifier, null pointer exception
		// for (int i = 0; i < prenomsTabCopy.length; i++) {
		// for (int j = 0; j < prenomsTabCopy.length; j++) {
		// if (prenomsTabCopy[i].equals(prenomsTabCopy[j])) {
		// prenomsTabCopy[j] = "";
		// }
		// }
		// }

		for (int a = 0; a < prenomsTabCopy.length; a++) {
			System.out.println("Il existe " + occurences[a] + " occurence(s) du prénom " + prenomsTabCopy[a]
					+ " dans le tableau de prénoms.");
		}
	}
	// Exercice 5 : Méthodes pour le scrabble

	public static void exo5Q() {

		char[] lettresTab = new char[7];

		String mot = "ANAGFNVEKAIP";

	}

	public static int valeurLettre(char lettre) {

		char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int[] valeurAlphabet = { 2, 5, 4, 6, 1, 2, 6, 7, 2, 9, 5, 3, 6, 7, 5, 8, 9, 3, 6, 5, 8, 7, 9, 9, 9, 9 };
		int valeurRenvoyee = -1;

		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] == lettre) {
				valeurRenvoyee = valeurAlphabet[i];
			}
		}
		if (valeurRenvoyee == -1) {
			throw new RuntimeException("La lettre doit exister dans l'alphabet...");
		}
		return valeurRenvoyee;
	}

	public static double scoreMot(String mot) {

		String motMaj = mot.toUpperCase();
		char[] lettresMot = new char[mot.length()];

		for (int i = 0; i < lettresMot.length; i++) {
			lettresMot[i] = motMaj.charAt(i);
		}

		// calcul du score :
		double score = 0.0;
		for (int i = 0; i < lettresMot.length; i++) {
			score += valeurLettre(lettresMot[i]);
		}
		score = score / lettresMot.length;

		return score;
	}

	// méthode retourne cmb de lettres (int) il manque pour écrire un mot DONNE avec
	// les jetons
	// du joueur :
	public static int nombreLettresManquantes(String mot, char[] jetonsJoueur) {

		char[] motTab = new char[mot.length()];
		int lettresTrouvees = -1;

		for (int i = 0; i < motTab.length; i++) { // répétition de code, à changer
			motTab[i] = mot.toUpperCase().charAt(i);
		}

		for (int i = 0; i < motTab.length; i++) {
			for (int j = 0; j < jetonsJoueur.length; j++) {
				if (motTab[i] == jetonsJoueur[j]) {
					jetonsJoueur[j] = '\u0000';
				}
			}
		}

		for (int i = 0; i < motTab.length; i++) {
			if (jetonsJoueur[i] != '\u0000') {
				lettresTrouvees++;
			}
		}
		int lettresManquantes = jetonsJoueur.length - lettresTrouvees;
		
		return lettresManquantes;
	}
}
