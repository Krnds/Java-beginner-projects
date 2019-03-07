package fr.krnds.NFA031project;

public class Test {

	public static void main(String[] args) {

		System.out.println(donnerTirage());
		char[] tirage = donnerTirage();
		int[] indicesTirage = new int[10];
		for (int i = 0; i < indicesTirage.length; i++) {
			indicesTirage[i] = i;
			System.out.print(indicesTirage[i]);
		}

		System.out.println("\nProposez un mot : ");
		String essai = Terminal.lireString(); // essai = chaîne de caractères != tableau

		char[] essaiTab = essai.toCharArray(); // conversion d'une String en un tableau de char
		int[] indicesEssai = new int[essai.length()];

//		for (int i = 0; i < essaiTab.length; i++) {
//			System.out.print(essaiTab[i] + " ");
//			indicesEssai[i] = i;
//			System.out.println(i);
//		}

		char[] temp = new char[essaiTab.length];

//		for (int i = 0; i < tirage.length; i++) {
//			for (int j = 0; j < essaiTab.length; j++) {
//				if (essaiTab[j] != tirage[j]) {
//					temp[j] = essaiTab[j];
//				} else {
//					System.out.println("IL ya la lettre en commun " + essaiTab[j]);
//				}
//				for (int num = 0; num < temp.length; num++) {
//						System.out.println(temp);
//				}
//			}
//
//		}
		
		for (int j = 0; j < essaiTab.length; j++) { //1ere boucle poiur faire le tour de l'essai 
			for (int i = 0; i < tirage.length; i++) { //2eme boucle pour faire le tour du tirage ==> FIN
				if (essaiTab[j] == tirage[i]) {
					System.out.println("La lettre " + tirage[i] + " de votre mot a été retrouvée dans le tirage");
					temp[j] = tirage[i];
					tirage[i] = '\u0000';
					j++;
				}
			}
		}
		
//		for (int i = 0; i < 1; i++)
//		System.out.println(temp[i]);
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

}

// System.out.println(s1.charAt(4));
// String s1 = "bonjour";
// String s2 = "embollie";

/*
 * TODO: Mettre les indices du tirage en dessous des lettres de l'essaiTab qui correspondent au tirage
 * TODO: documenter chaque méthode 
 * TODO: si on ne trouve pas la première lettre,
 * rajouter cette "lettre en trop" à un nouveau tableau 
 * TODO: si 0 lettres tapées redemander de taper ou sinon relancer un autre tirage
 */