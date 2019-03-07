package fr.karinedias.exercicesclasses;

public class Polynome {

	int[] coeff;
	
	public Polynome() {
		
		coeff = new int[0];
	}
	
	public void afficher() {
		
		if (coeff.length != 0) {
		
			int n = coeff.length;
			
			System.out.println(coeff.length - 1);
			for (int i = 0; i < coeff.length; i++) {
				System.out.println((n - 1 - i) + "x");
			}
		}
	}
}
