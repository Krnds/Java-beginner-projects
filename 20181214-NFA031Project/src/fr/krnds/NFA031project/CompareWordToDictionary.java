package fr.krnds.NFA031project;

/**
 * @author karine
 *
 */
public class CompareWordToDictionary {
	
	public static void main(String[] args) {
		// Tests pour comparer si un mot (char[][] est présent dans
		// un dictionnaire (char[][]))
		
		 System.out.println("Entrez un mot");
		 char[] mot = Terminal.lireString().toCharArray();

		if (motEstDansDico(mot, getDictionnaire())) {
			System.out.println("Le mot est dans le dico");
		} else {
			System.out.println("Le mot n'est pas dans le dictionnaire");
		}
	}

	public static boolean motEstDansDico(char[] mot, char[][] dictionnaire) {

		boolean present = false;
		
		for (int i = 0; i < dictionnaire.length; i++) {
			if (estIdentique(mot, dictionnaire[i])) {
				present = true;
			}
		}
		
		return present;
	}
	
	public static boolean estIdentique(char[] mot1, char[] mot2) {

		boolean identiques;
		
		if (mot1.length != mot2.length) {
			identiques = false;
		} else {
			for (int i = 0; i < mot1.length; i++) {
				if (mot1[i] != mot2[i]) {
					identiques = false;
					break;
				}
			}
			identiques = true;
		}
		
		return identiques;
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