package fr.karinedias.motlepluslong;

import fr.karinedias.motlepluslong.utils.MotLePlusLongUtil;
import fr.karinedias.motlepluslong.utils.Terminal;

public class MotLePlusLong {

	// #################
	// METHODES LOGIQUES
	// #################

	// Teste si l'essai rentré ne fait pas plus de 10 lettres.
	public static boolean essaiFaitBonneLongueur(char[] essai) {
		return (essai.length <= 10);
	}

	// Teste si l'essai rentré contient des lettres entre A et Z.
	public static boolean essaiContientLettres(char[] essai) {
		for (int i = 0; i < essai.length; i++) {
			if (!(essai[i] >= 'A' && essai[i] <= 'Z')) {
				return false;
			}
		}
		return true;
	}

	// Teste si l'essai est valide
	public static boolean essaiEstValide(char[] essai) {
		return essaiFaitBonneLongueur(essai) && essaiContientLettres(essai);
	}

	// Renvoie un tableau de lettres surnuméraires. Le tableau sera donc vide si
	// l'entrée ne contient pas de lettres surnuméraires.
	public static char[] trouverLettresSurnumeraires(char[] essai, char[] tirage) {
		char[] tirageTemp = copieTirage(tirage);
		char[] lettresSurnum = new char[10];
		int lettresSurnumPos = 0;
		for (int i = 0; i < essai.length; i++) {
			for (int j = 0; j < tirage.length; j++) {
				if (essai[i] == tirageTemp[j]) {
					tirageTemp[j] = '\u0000';
					break;
				} else if (j == (tirage.length - 1)) {
					lettresSurnum[lettresSurnumPos] = essai[i];
					lettresSurnumPos++;
				}
			}
		}
		return lettresSurnum;
	}

	// Crée une copie du tirage qui pourra être altérée.
	public static char[] copieTirage(char[] tirage) {
		char[] tirageBis = new char[tirage.length];
		for (int i = 0; i < tirage.length; i++) {
			tirageBis[i] = tirage[i];
		}
		return tirageBis;
	}

	// Teste si le tirage contient des lettres surnuméraires.
	public static boolean essaiContientLettresSurnumeraires(char[] lettresSurnum) {
		for (int i = 0; i < lettresSurnum.length; i++) {
			if (lettresSurnum[i] != '\u0000') {
				return true;
			}
		}
		return false;
	}

	// Renvoie une correspondance d'indices entre l'essai et le tirage sous forme
	// d'un tableau d'entier. Si une lettre n'est pas trouvée, la valeur d'indice
	// est -1.
	public static int[] correspondanceIndices(char[] essai, char[] tirage) {
		char[] tirageTemp = copieTirage(tirage);

		int[] motIndice = new int[essai.length];
		for (int i = 0; i < motIndice.length; i++) {
			motIndice[i] = -1;
		}

		for (int i = 0; i < essai.length; i++) {
			for (int j = 0; j < tirageTemp.length; j++) {
				if (essai[i] == tirageTemp[j]) {
					motIndice[i] = j;
					tirageTemp[j] = '\u0000';
					break;
				}
			}
		}
		return motIndice;
	}

	// Teste si l'essai est un mot qui existe dans le dictionnaire.
	public static boolean essaiEstDansDico(char[] essai, char[][] dico) {
		for (int i = 0; i < dico.length; i++) {
			char[] mot = dico[i];
			if (estIdentique(essai, mot)) {
				return true;
			}
		}
		return false;
	}

	// Teste si l'essai est identique à un mot donné du dictionnaire.
	public static boolean estIdentique(char[] essai, char[] mot) {
		if (essai.length != mot.length) {
			return false;
		} else {
			for (int i = 0; i < essai.length; i++) {
				if (essai[i] != mot[i]) {
					return false;
				}
			}
		}
		return true;
	}

	// ####################
	// METHODES D'AFFICHAGE
	// ####################

	// Affiche un tableau de caractères.
	public static void afficherTableau(char[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
	}

	// Affiche une correspondance d'indices entre l'essai et le tirage
	// Exemple :
	// BONJOUR
	// 1432586
	// 0123456789
	// ABJNOORTUZ
	public static void affichageCorrespondanceIndices(char[] essai, char[] tirage) {
		System.out.println("\n---");

		// Affichage de l'essai
		for (int i = 0; i < essai.length; i++) {
			System.out.print(essai[i]);
		}
		Terminal.sautDeLigne();

		// Affichage des correspondances
		int[] correspondanceIndices = correspondanceIndices(essai, tirage);

		for (int i = 0; i < correspondanceIndices.length; i++) {
			if (correspondanceIndices[i] != -1) {
				System.out.print(correspondanceIndices[i]);
			} else {
				System.out.print('#');
			}
		}

		Terminal.sautDeLigne();

		// Affichage des indices
		for (int i = 0; i < tirage.length; i++) {
			System.out.print(i);
		}
		Terminal.sautDeLigne();

		// Affichage du tirage
		afficherTableau(tirage);

		System.out.println("\n---\n");
	}

	// Affiche les lettres surnuméraires s'il y en a, vérifie si l'essai est un mot
	// qui existe dans le dictionnaire ou pas, puis affiche le nombre de lettres de
	// l'essai de l'utilisateur
	public static void affichageEssaiValide(char[] essai, char[] tirage, char[][] dico) {
		// Affichage des correspondances d'indices
		affichageCorrespondanceIndices(essai, tirage);

		// Affichage des lettres surnuméraires
		char[] lettresSurnum = trouverLettresSurnumeraires(essai, tirage);

		if (essaiContientLettresSurnumeraires(lettresSurnum)) {
			System.out.println("Attention, les lettres surnuméraires sont :");
			afficherTableau(lettresSurnum);
			System.out.println();
		}

		// Affichage de la longueur si le mot est dans le dictionnaire
		if (!essaiEstDansDico(essai, dico)) {
			System.out.println("Votre mot n'est pas dans le dictionnaire...");
		} else {
			System.out.print("Votre mot existe :) ");
			int longueurEssai = essai.length;
			if (longueurEssai == 1) {
				System.out.println("Il comporte " + longueurEssai + " lettre.");
			} else {
				System.out.println("Il comporte " + longueurEssai + " lettres.");
			}
		}
	}

	// Vérifie si l'essai est valide : il doit comporter uniquement des lettres de A à
	// Z et pas plus de 10 lettres
	public static void affichageEssaiInvalide(char[] essai) {
		if (!essaiContientLettres(essai)) {
			System.out.println("Votre essai doit contenir uniquement des lettres.");
		} else if (!essaiFaitBonneLongueur(essai)) {
			System.out.println("Votre essai doit comporter 10 lettres au maximum.");
		}
	}

	// ############
	// METHODE MAIN
	// ############

	public static void main(String[] args) {
		char redo = ' ';
		do {
			// Chargement du dictionnaire
			char[][] dico = MotLePlusLongUtil.getDictionnaire();

			// Tirage
			char[] tirage = MotLePlusLongUtil.donnerTirage();
			System.out.print("Tirage : ");
			afficherTableau(tirage);

			// Proposition de l'utilisateur et résultat
			boolean essaiValide;
			do {
				System.out.println("\nProposez un mot (ou une ligne vide pour passer) : ");
				char[] essai = Terminal.lireString().toUpperCase().toCharArray();

				// Déroulement du programme
				if (essaiEstValide(essai)) {
					essaiValide = true;
					affichageEssaiValide(essai, tirage, dico);
				} else {
					affichageEssaiInvalide(essai);
					essaiValide = false;
				}
			} while (!essaiValide);
			System.out.println("Appuyer sur 'o' pour continuer et toute autre touche pour arrêter.");
			redo = Terminal.lireChar();
		} while (redo == 'o');

		System.out.println("Au revoir !");
	}
}

/*TODO: Trouver le mot le plus long suivant le tirage
 * TODO: afficher correctement x mots les plus longs
 * 
 * 
 */
