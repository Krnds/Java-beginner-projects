package fr.krnds.BuiltJavaProject;

public class Issue1 {

	public static void main(String[] args) {

//		char[] tirage = donnerTirage();
//		String tirageString = new String(tirage); // using string constructor from char array to String type
//
//		System.out.print("Tirage: ");
//		System.out.println(tirage);
//		System.out.println("Proposez un mot (ou une ligne vide pour passer):");
//
//		char[] mot = (Terminal.lireString()).toCharArray();
//		char[] tirageBis = new char[tirage.length];
//		for (int i = 0; i < tirage.length; i++) { // copie tirage pour utiliser les indices pr la correspondance, utile
//													// ???
//			tirageBis[i] = tirage[i];
//		}
//
//		if (mot.length <= 10) {
//			for (int j = 0; j < mot.length; j++) { // first loop for the word
//				for (int i = 0; i < tirage.length; i++) { // second loop for the printout
//					if (mot[j] == tirage[i]) {
//						System.out.println("La lettre " + tirage[i] + " de votre mot a été retrouvée dans le tirage");
//						tirage[i] = '\u0000';
//						break;
//					}
//				}
//			}
//		} else {
//			System.out.println("Attention, le mot ne doit pas faire plus de dix lettres !");
//		}
		
		char[] tirage = donnerTirage();
		String tirageString = new String(tirage); // using string constructor from char array to String type

		System.out.print("Tirage: ");
		System.out.println(tirage);
		System.out.println("Proposez un mot (ou une ligne vide pour passer):");

		char[] mot = (Terminal.lireString()).toCharArray();
		
		verificationLettres(mot, tirage);
		char[] tirageBis = new char[tirage.length];
		for (int i = 0; i < tirage.length; i++) { // copie tirage pour utiliser les indices pr la correspondance ?
			tirageBis[i] = tirage[i];
		}

		
		int j = 0;
		while (j < mot.length) {
			System.out.print(mot[j]);
			j++;
		}
		Terminal.sautDeLigne();
		correspondance(mot, tirageBis);
		Terminal.sautDeLigne();
		for (int a = 0; a < tirage.length; a++) {
			System.out.print(a);
		}
		Terminal.sautDeLigne();
		Terminal.ecrireString(tirageString + "\n");
		
		System.out.println("Votre mot fait " + mot.length + " lettre(s).");

	}

	 public static void verificationLettres(char[] mot, char[] tirage) {
		//ICI METTRE UNE BOUCLE POUR RECOMMENCER LE TIRAGE

			if (mot.length <= 10) {
				for (int j = 0; j < mot.length; j++) { 
					for (int i = 0; i < tirage.length; i++) { 
						if (mot[j] == tirage[i]) {
							System.out.println("La lettre " + tirage[i] + " de votre mot a été retrouvée dans le tirage");
							tirage[i] = '\u0000';
							break;
						}
					}
				}
			} else {
				System.out.println("Attention, le mot ne doit pas faire plus de dix lettres !");
			}
	 }

	 
	 
	 
//	 public static void affichage(char[] mot, char[] tirage) {
//	
//	 String tirageString = new String(tirage);
//	 char[] tirageBis = new char[tirage.length];
//		for (int i = 0; i < tirage.length; i++) { // copie tirage pour utiliser les indices pr la correspondance, utile ?
//			tirageBis[i] = tirage[i];
//		}
//	 
//		int j = 0;
//		while (j < mot.length) {
//			System.out.print(mot[j]);
//			j++;
//		}
//		Terminal.sautDeLigne();
//		correspondance(mot, tirageBis);
//		Terminal.sautDeLigne();
//		for (int a = 0; a < tirage.length; a++) {
//			System.out.print(a);
//		}
//		Terminal.sautDeLigne();
//		Terminal.ecrireString(tirageString + "\n");
//		
//		System.out.println("Votre mot fait " + mot.length + " lettre(s).");
//	 }

	public static void correspondance(char[] mot, char[] tirage) {
		//correspondance entre les indices du mot et du tirage
		int[] motIndice = new int[mot.length];

		for (int i = 0; i < mot.length; i++) {
			for (int j = 0; j < tirage.length; j++) {
				if (mot[i] == tirage[j]) {
					motIndice[i] = j;
					tirage[j] = '\u0000';
					break;
				}
			}
		}
		int i = 0;
		while (i < mot.length) {
			System.out.print(motIndice[i]);
			i++;
		}

	}

//	public static boolean recommencer() {
//
//		boolean loop = false;
//
//		System.out.println("\nVoulez-vous recommencer ? [o/n]");
//		String rep = Terminal.lireString();
//		do {
//			if (rep.equals("o")) {
//				loop = true;
//			} else if (rep.equals("n")) {
//				loop = false; // inutile ?
//			}
//		} while (rep != "o" | rep != "n");
//		System.out.println("Je n'ai pas bien compris votre réponse. Veuillez répondre par o/n");
//		// si l'utilisateur rentre autre chose que o/n, imprimer ceci
//		return loop;
//	}

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

	// public static
}

// TODO : faire une boucle pour recommencer tout le code en cas de ligne vide
// TODO : inclure le cas où il y a des lettres en trop dans le mot proposé :
// TODO : attention à la casse du mot !! car peut faire foirer tout le code !
// Votre mot ne correspond pas au tirage, il manque
// ex: 1 occurence de la lettre E
// TODO: tester tous les cas limites, cf. tests unitaires
// TODO: méthode main, donnerTirage, appariemment, correspondance,
// lettresSurnuméraires, recommencer, affichage
// données dans le tirage
// TODO: rechercher le mot le plus long
