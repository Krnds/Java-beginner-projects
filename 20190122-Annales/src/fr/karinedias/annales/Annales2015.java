package fr.karinedias.annales;

public class Annales2015 {

	public static void Exo3ExoBoucle() {
		
		for (int i = 0; i < 9; i++) {
			for (int j = i; j < 6; j = i + 1) {
				System.out.println("*");
			}
		}
		
	}
	
	public static void Occurences() {
		String[] prenoms = {"toto", "tata", "titi", "toutou", "cricri", "fafa", "titi", "toto", "toto"};
		int a = 0;
		int[] occurences = new int[prenoms.length];
		String[] liste = new String[prenoms.length];
		
		for (int i = 0; i < prenoms.length; i++) {
			for (int j = 0; j < liste.length; j++) {
				if (prenoms[i] != liste[j]) {
					liste[j] = prenoms[i];
					break;
				}
			}
		}
		while (a < liste.length) {
			System.out.println(liste[a]);
			a++;
		}
		
	}
	
	public static void main (String[] args) {
		Occurences();
	}
	
}
