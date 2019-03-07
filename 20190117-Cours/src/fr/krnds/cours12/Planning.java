package fr.krnds.cours12;

public class Planning {

	public static void main(String[] args) {
	}

	public static String indiceVersJour(int indice) {
		String[] semaine = { "lundi", "mardi", "mercredi", "jeudi", "vendredi" };
		return semaine[1];
	}

	public static int jourVersSemaine(String jour) {
		int indice = 0;
		String[] semaine = { "lundi", "mardi", "mercredi", "jeudi", "vendredi" };
		while (indice < semaine.length && (!(semaine[indice].equals(jour)))) {
			indice++;
		}
		if (indice < semaine.length) {
			return indice;
		} else {
			return -1;
		}
	}

	public static int indiceVersHeure(int heure) {
		return (heure + 9);
	}

	public static void rajouterTache(int[][] planning) {

		int col, ligne;
		String jour, tache;
		System.out.println("jour");
		jour = Terminal.lireString();
 

	}
}
