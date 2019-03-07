package fr.karinedias.entrainement;

import fr.karinedias.annales.Terminal;

public class Decipher {

	/*
	 * Objectif : faire un prgramme qui va tenter de déchiffrer le texte donné en
	 * input suivant une clé qui est une rotation de l'alphabet (d'où le nom "rot")
	 */

	public static String texte () {
		System.out.println("Entrez la phrase à chiffrer svp :");
		String phrase = Terminal.lireString().toUpperCase();
		
		return phrase;
	}

	public static char[] getAlphabet() {

		char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		return alphabet;
	}

	public static int clefDeChiffrement() {
		System.out.println("Veuillez rentrer un chiffre entre 1 et 26 pour la clé de chiffrage SVP.");
		int clef = Terminal.lireInt();

		return clef;
	}

	public static char[] chiffrement(String texte, char[] alphabet, int clef) {

		char[] texteTab = texte.toCharArray();
		char[] chiffrage = new char[texte.length()];

		for (int i = 0; i < texte.length(); i++) {
			for (int j = 0; j < getAlphabet().length; j++) {
				if (texteTab[i] == getAlphabet()[j]) {
					chiffrage[i] = getAlphabet()[((j + clef) % 26)];
				}
			}
		}
		
		

		return chiffrage;
	}

	public static void main(String[] args) {

		String phrase = texte();
		char[] resultat = chiffrement(phrase, getAlphabet(), clefDeChiffrement());
		for (int i = 0; i < phrase.length(); i++) {
			System.out.print(resultat[i]);
		}
	}
}
