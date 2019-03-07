package fr.krnds.NFA031project;

public class Solution {

	public static void main(String[] args) {

		char[][] tab1 = { { 's', 'a', 'l', 'u', 't' } };
		char[][] tab2 = { { 's', 'a' }, { 's', 'a', 'l', 'u', 't', 'a', 't', 'i', 'o', 'n' }, { 's', 'a', 'l', 'e' },
				{ 's', 'a', 'l', 'u', 't' } };

		if (wordFound(tab1, tab2)) {
			System.out.println("CA MARCHE");
		} else {
			System.out.println("IL Y A UN PROBLEME");
		}
	}

	public static boolean wordFound(char[][] word, char[][] dictionary) {

		boolean found = false;

		// long différente != mot
		// une lettre différente != mot

		for (int i = 0; i < dictionary.length; i++) {// parcours les mots du dico
			for (int j = 0; j < dictionary[i].length; j++) {// parcours les lettre de chaque mot pour i lignes = nb of
															// columns
				if (dictionary[i].length != word.length) {
					found = false;
				} else if (dictionary[i][j] != word[0][j]) {
					break;
				} else {
					found = true;
				}

			}
		}

		return found;
	}

	public static char[][] getDictionnaire() {
		char[][] res;
		char[][] temp = new char[500000][];
		int nbMots = 0;
		try {
			java.io.FileReader fr = new java.io.FileReader("/home/karine/Téléchargements/dico_nfa031.txt");
			java.io.BufferedReader br = new java.io.BufferedReader(fr);
			String ligne = br.readLine();
			while (ligne != null) {
				temp[nbMots] = ligne.trim().toCharArray();
				nbMots++;
				ligne = br.readLine();
			}
			br.close();
		} catch (java.io.FileNotFoundException e) {
			throw new RuntimeException("Fichier dico_nfa031.txt non trouvé");
		} catch (java.io.IOException e) {
			throw new RuntimeException("Problème à la lecture du fichier");
		}
		res = new char[nbMots][];
		for (int i = 0; i < nbMots; i = i + 1) {
			res[i] = temp[i];
		}
		return res;
	}

}
