package fr.krnds.NFA031project;

import fr.krnds.NFA031project.Terminal;

public class ProjetJava {

	public static void main(String[] args) {

		char[] tirage = { 'B', 'N', 'J', 'O', 'R', 'U' };
		char[] essai = { 'B', 'R', 'U' };
		char[] temp = new char[essai.length];

		for (int j = 0; j < essai.length; j++) { //1ere boucle poiur faire le tour de l'essai 
			for (int i = 0; j < tirage.length; i++) { //2eme boucle pour faire le tour du tirage ==> FIN
				if (essai[j] == tirage[i]) {
					System.out.println("La lettre " + tirage[i] + " de votre mot a été retrouvée dans le tirage");
					temp[j] = tirage[i];
					tirage[i] = '\u0000';
					j++;
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
}

/*
 * TODO: Faire une méthode pour vérifier si les lettres du motUtilisateur
 * correspondent aux lettres du tirage TODO: Apposer au motUitlisateur les
 * chiffres correspondant aux numéros des lettres du tirage
 */