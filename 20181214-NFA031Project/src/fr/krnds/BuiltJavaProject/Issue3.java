package fr.krnds.BuiltJavaProject;

public class Issue3 { // BEST WORD ON DICTIONARY

	public static void main(String[] args) {

		char[] tirage = donnerTirage();

		System.out.print("Tirage: ");
		System.out.println(tirage);
		System.out.println("Proposez un mot (ou une ligne vide pour passer):");

		char[] mot = (Terminal.lireString()).toCharArray();
		char[][] dico = getDictionnaire();

		char[] motLePlusLong = new char[10]; // au max contient 10 lettres

		for (int i = 0; i < dico.length; i++) { // mots
			for (int j = 0; j < dico[0].length; j++) { // lettres mots dico
				for (int k = 0; k < tirage.length; k++) { // lettres tirage
					if (dico[i][j] == tirage[k]) {
						tirage[k] = '\u0000';
						motLePlusLong[k] = dico[i][j];
						break;
					}

				}
			}
		}

	}

	public static char[] nombreLettres () {
		
		String t = "ABEEHINORT";
		char[] tirage = (t).toString().toCharArray();
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',  'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};
		char[][] dico = getDictionnaire();
		char[][] mapLettres = new char[t.length()][t.length()]; //new char[10][10]
		//occurences permet de compter le nombre de lettres qui apparaissent
		// ici initialisé à long tirage car ne peut pas avoir plus de 10 occurences d'une meme lettre
		
		for (int a = 0; a < alphabet.length; a++) {
			for (int b = 0; b < tirage.length; b++) {
			if (alphabet[a] == tirage[b])
				mapLettres[a][]
		}
		}
		
		for (int i = 0; i < tirage.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (tirage[i] == alphabet[j]) {
					occurence[j]
				}
					
			}
			
		}
		
		
	}

	public static char[] donnerTirage() {
		double[] frequences = { 0.084641116045612, 0.097550346533667, 0.134264256131715, 0.175931501299866,
				0.339787563705305, 0.352412789645191, 0.366356662429924, 0.37898710353533, 0.454338255487703,
				0.458247915903501, 0.461526843221907, 0.517821090574744, 0.547529673593674, 0.620002807215,
				0.677444355180383, 0.70566493929644, 0.71299279223788, 0.781799811286431, 0.855650833407438,
				0.922800098125308, 0.974199670376239, 0.986838818540602, 0.98881203071521, 0.993095137557963,
				0.998288765757996, 1 };
		char[] res = new char[10];
		for (int i = 0; i < res.length; i++) {
			double ausort = Math.random();
			int j = 0;
			while (frequences[j] < ausort)
				j++;
			res[i] = (char) ('A' + j);
		}
		java.util.Arrays.sort(res);
		return res;
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
