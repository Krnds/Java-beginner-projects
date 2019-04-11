package fr.karinedias;

import java.util.Scanner;

public class Session2013 {

	public static String[] candidats() {

		String[] tabCandidats = { "Riri", "Fifi", "Loulou" };
		int[] indicesCandidats = new int[3];

		for (int i = 0; i < tabCandidats.length; i++) {
			indicesCandidats[i] = i;
		}
		return tabCandidats;
	}

	public static int[][] votes() {
		Scanner Sc = new Scanner(System.in);
		int[][] votesCandidats = new int[3][5];

		for (int i = 0; i < votesCandidats.length; i++) {
			for (int j = 0; j < votesCandidats[0].length; j++) {
				System.out.println("Quel est le nombre de votes pour le candidat " + candidats()[i]
						+ " au bureau de vote n° " + (j + 1));
				votesCandidats[i][j] = Sc.nextInt();
			}
		}
		return votesCandidats;
	}

	public static void main(String[] args) {

		// tabToString(votes());
		// System.out.println(calcul(votes()));
		allSameBoolean();

	}

	public static void tabToString(int[][] tab) {

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}
	}

	public static double calcul(int[][] tab) {
		double resultat = 0;

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				resultat += tab[i][j];
			}
		}
		return resultat;
	}

	public static void allSameBoolean() {
		boolean same = true;

		Scanner sc = new Scanner(System.in);
		boolean[] tab = new boolean[3];

		for (int i = 0; i < tab.length; i++) {
			System.out.println("Valeur de la case " + (i + 1));
			tab[i] = sc.nextBoolean();
		}

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != same) {
				same = false;
				System.out.println("Pas les mêmes valeurs booléennes");
			} else {
				System.out.println("Pas les mêmes valeurs booléennes");
			}
		}
	}
}
