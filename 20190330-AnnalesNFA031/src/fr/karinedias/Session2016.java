package fr.karinedias;

import java.util.Arrays;
import java.util.Scanner;

public class Session2016 {

	public static String programmesEtBoucles() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une chaine de caractères : ");
		String str = sc.nextLine();
		String fin = "";
		int maxBoucles = 40 % str.length();

		for (int i = 0; i < maxBoucles; i++) {
			fin = fin + str;
		}
		fin = fin + "\n";
		return fin;
	}

	public static void main(String[] args) {
		System.out.println(programmesEtBoucles());
		System.out.println("Entrez une chaine de caractères : ");
		String str = "nfa031";

		for (int i = 1; i <= str.length(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(str);
			}
			System.out.println();
		}

		// nfa031
		// nfa031nfa031
		// nfa031nfa031nfa031
		// nfa031nfa031nfa031nfa031
		// nfa031nfa031nfa031nfa031nfa031
		// nfa031nfa031nfa031nfa031nfa031nfa031

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("\n\tAutre énoncé : \n");

		// 0 0 0 0 0 0 0 0 0 0
		// 1 1 1 1 1 1 1 1 1 1
		// 2 2 2 2 2 2 2 2 2 2
		// 3 3 3 3 3 3 3 3 3 3
		// 4 4 4 4 4 4 4 4 4 4
		// 5 5 5 5 5 5 5 5 5 5
		// 6 6 6 6 6 6 6 6 6 6
		// 7 7 7 7 7 7 7 7 7 7
		// 8 8 8 8 8 8 8 8 8 8
		// 9 9 9 9 9 9 9 9 9 9

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		// 5 5 5 5 5
		// 6 6 6 6 6 6
		// 7 7 7 7 7 7 7

		programmesEtTableaux();
	}

	public static void programmesEtTableaux() {

		String[][] gestionTaches = { { "Analyse", "F" }, { "Tester projet", "A" }, { "Acheter deux baguettes", "A" },
				{ "Soutenance", "D" }, { "Révisions examen", "P" }, { "RDV ophtalmo", "P" },
				{ "Inscrire NFA032", "P" } };
		String[][] gestionTaches2 = new String[8][2];
		String[][] gestionTaches3 = gestionTaches;

		gestionTaches2[0][0] = "Analyse";
		gestionTaches2[0][1] = "F";
		gestionTaches2[1][0] = "Tester projet";
		gestionTaches2[1][1] = "A";

		// System.out.println("Les tâches ayant été réalisées récemment sont : \n");

		// for (int i = 0; i < gestionTaches.length; i++) {
		// for (int j = 0; j < gestionTaches[0].length; j++) {
		// if (gestionTaches[i][j] == "F") {
		// System.out.print("- " + gestionTaches[i][j]);
		// }
		// }
		// }

		System.out.println(Arrays.deepToString(gestionTaches3));

		System.out.println("Voici la liste des tâches à faire par ordre de priorité : ");

		for (int i = 0; i < gestionTaches.length; i++) {
			for (int j = 0; j < gestionTaches[0].length; j++) {
				if (gestionTaches[i][1].indexOf(0) == 'F') {
					System.out.println("tâche numéro " + i);
					System.out.println(gestionTaches[j]);
				}
			}
		}

		System.out.println("Tâches réalisées aujourd'hui : ");
		for (int i = 0; i < gestionTaches.length; i++) {
			for (int j = 0; j < gestionTaches[0].length; j++) {
				if (gestionTaches[i][1].indexOf(0) == 'A') {
					System.out.println("YEAH");
				}
			}
		}

		double[] temp = { 8.0, 7.8, 9.0, 11.5, 2.0 };
		double moy = 0.0;

		for (int i = 0; i < temp.length; i++) {
			moy += temp[i];
		}
		moy = moy / temp.length;
		System.out.println(moy);

		int[] t = { 2, 1, 2, 0, 3, 3, 3, 5, 5, 5, 10, 11 };

		System.out.println(repetitions(t));

		int[] ecarts = { 2, 1, 2, 0, 3, 3, 3, 5, 5, 5, 10, 11 };
		System.out.println("Le plus grand écart du tableau est = " + ecartLePLusGrand(ecarts));

	}

	public static int repetitions(int[] tab) {
		// renvoe l'indice ou la 1ere repet a lieu
		int repet = -1;
		for (int i = 0; i < tab.length - 1; i++) {
			if (tab[i] == tab[i + 1]) {
				repet = i;
				break;
			}
		}
		return repet;
	}

	public static int ecartLePLusGrand(int[] tab) {
		int ecartMax = 0;

		for (int i = 0; i < tab.length - 1; i++) {
			if (Math.abs(tab[i + 1] - tab[i]) > ecartMax) {
				ecartMax = tab[i + 1] - tab[i];
			}
		}

		return ecartMax;
	}
}
