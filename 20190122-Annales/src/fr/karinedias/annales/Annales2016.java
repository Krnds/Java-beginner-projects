package fr.karinedias.annales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Annales2016 {

	public static void puissanceInf100(int nombre) {
		int puissance = nombre;
		for (int i = 0; i < 100; i++) {
			if (nombre == 1) {
				System.out.println(1);
			}
			while (puissance < 100) {
				puissance = nombre * puissance;

				System.out.println(puissance);
			}
		}
	}

	public static void main(String[] args) {
		// System.out.println("Veuillez rentrer un nombre entier svp");
		// int nombre = Terminal.lireInt();
		// puissanceInf100(nombre);
		// moyenneNotes();

		//comptesTab();
	}

	public static double moyenneNotes() {
		double somme = 0, moyenne = 0;

		for (int i = 0; i < 7; i++) {
			double n = 0.0;
			boolean correct = false;
			;

			while (!correct) {
				try {
					// atention de bien mettre le system.out dans le bloc try
					System.out.println("Veuillez rentrer la note n° " + (i + 1));
					int a = Terminal.lireInt();
					// on caste l'int lu en double
					n = (double) a;
					correct = true;
				} catch (RuntimeException e) {
					System.out.println("Vous devez rentrer un nombre.");
					correct = false;
				}
			}
			if (n < 0 || n > 20) {
				throw new RuntimeException();
			} else {
				// attention de faire le calcul encore dans la boucle for,
				// sinon la moyenne = 0.0
				somme = somme + n;
				moyenne = somme / i;
			}
		}
		System.out.println("moyenne : " + moyenne);

		return moyenne;
	}

	public static void comptesTab() {
		boolean incorrect = false;
		int[] numComptes = { 501, 87878, 88888 };
		double[] soldeComptes = { 10000, 5000.5, 100000 };

		for (int i = 0; i < numComptes.length; i++) {
			System.out.println("num de compte : " + numComptes[i] + " montant sur le compte : " + soldeComptes[i]);
		}
		while (!incorrect)
			try {
				System.out.println("Numéro du compte à débiter : ");
				int num1 = Terminal.lireInt();
				for (int i = 0; i < numComptes.length; i++) {
					if (numComptes[i] != num1) {
						incorrect = true;
						throw new RuntimeException();
						// System.out.println("Le numéro de compte demandé n'existe pas.");

					}

					System.out.println("Numéro du compte à créditer : ");
					int num2 = Terminal.lireInt();
					if (numComptes[i] != num2) {
						incorrect = true;
						throw new RuntimeException();

					}
				}

			} catch (RuntimeException e) {
				System.out.println("Le numéro du compte n'est pas correct. Veuillez recommencer.");
				incorrect = true;
			}
		try {
			System.out.println("Quel est le montant à transférer ?");
			double montant = Terminal.lireInt();
		} catch (RuntimeException e) {
			System.out.println("Le montant indiqué n'est pas correct. Veuillez recommencer");
			incorrect = true;
		}
	}
		
		public static void transfert(int compte1, int compte2, int[] numCompte, double[]soldeCompte) {
			
			System.out.println("Montant de la somme à transférer :");
			int montant = Terminal.lireInt();
			for (int i = 0; i < numCompte.length; i++) {
				if (compte1 == numCompte[i]) {
					//débit du compte 1
					soldeCompte[i] = soldeCompte[i] - montant;
				}
				if (compte2 == numCompte[i]) {
					//crédit du compte 2
					soldeCompte[i] = soldeCompte[i] + montant;
				}
			}
			
		}
		
		
		public static ArrayList<Integer> ajoutCompte(int num) {
			
			ArrayList<Integer> numComptes = new ArrayList<Integer>(); 
			numComptes.add(num);
			//ajoute à la fin de la liste le compte spécifié.
			
			return numComptes;
		}
		
		public static ArrayList<Integer> supprimerCompte(int num) {
			
			ArrayList<Integer> numComptes = new ArrayList<Integer>();
			numComptes.remove(num);
			//supprime l'élément à la position num
		
			return numComptes;
		}
	
	//Exo 5 : tableau à place vide
		
//		public static void nbOccupees()

}
