package fr.karinedias.entrainement;

public class Arrays {

	public static boolean arrayContaintOnlyLetter(char[] tableau) {
		
		boolean contientLettres = true;
		
		for (int i = 0; i < tableau.length; i++) {
			if (Character.isLetter(tableau[i]) == false) {
				contientLettres = false;
				break;
			}
		}
		
		return contientLettres;
	}
	public static void main(String[] args) {
		
		char[] array1 = {'a', 'b', 'v', 'k', 'T', 'P', 't'};
		char[] array2 = {'9', 't', '8', '3', '0', '7'};
		if (arrayContaintOnlyLetter(array1))
			System.out.println("Le tableau array1 contient des lettres");
		else {
			System.out.println("Le tableau array1 ne contient pas que des lettres");
		}
		
		if (arrayContainOneLetter(array2)) {
			System.out.println("Le tableau array2 contient au moins une lettre");
		} else {
			System.out.println("Le tableau array2 ne contient aucune lettre");
		}
	}
	
	public static boolean arrayContainOneLetter(char[] tableau) {
		boolean contientUneLettre = false;
		
		for (int i = 0; i < tableau.length; i++) {
			if (Character.isLetter(tableau[i])) {
				contientUneLettre = true;
				break;
			}
		}
		
		return contientUneLettre;
	}
}
