//le code fonctionne, à incorporer dans le code de l'issue 1
package fr.krnds.BuiltJavaProject;

public class Issue2 {
	//comment avoir la correspondance entre les indices du tirage et ceux du mot donné

	public static void main(String[] args) {

		char[] tirage = { 'A', 'D', 'E', 'E', 'I', 'O', 'R', 'R', 'S', 'T' };
		char[] mot = { 'R', 'E', 'S', 'I', 'D', 'E', 'R' };
		// int[] tirage_ind = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] mot_ind = new int[mot.length];


		int a = 0, b = 0, c = 0, d = 0;
		while (a < tirage.length) {
			System.out.print(tirage[a]);
			a++;
		}
		Terminal.sautDeLigne();
		while (b < tirage.length) {
			System.out.print(b);
			b++;
		}
		Terminal.sautDeLigne();
		while (c < mot.length) {
			System.out.print(mot[c]);
			c++;
		}
		Terminal.sautDeLigne();
		for (int i = 0; i < mot.length; i++) {
			for (int j = 0; j < tirage.length; j++) {
				if (mot[i] == tirage[j]) {
					mot_ind[i] = j;
					tirage[j] = '\u0000';
					break;
				}
			}
		}
		while (d < mot_ind.length) {
			System.out.print(mot_ind[d]);
			d++;
		}
	}
}
