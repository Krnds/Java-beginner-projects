package fr.karinedias.td14;

public class ExoExceptions {

	public static void main(String[] args) {
		// cf.http://deptinfo.cnam.fr/Enseignement/CycleA/APA/nfa031/docs/exercices-exceptions-1.pdf
		boolean correct = true;
		int[] tableau = { 17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };
		int x, y, a = 0;

		System.out.println("Voici le tableau : ");
		while (a < tableau.length) {
			System.out.print(tableau[a] + " ");
			a++;
		}
		do {
			Terminal.ecrireString("\nEntrez l’indice de l’entier à diviser: ");
			x = Terminal.lireInt();
			Terminal.ecrireString("Entrez le diviseur : ");
			y = Terminal.lireInt();
			try {
				Terminal.ecrireString("Le résultat de la division est: ");
				Terminal.ecrireIntln(division(tableau, x, y));
			} catch (ArithmeticException e) {
				System.out.println("Attention à ne pas diviser par zéro !");
				correct = false;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Veuillez rentrer un indice du tableau correct, entre " + tableau[0] + " et "
						+ tableau[tableau.length]);
				correct = false;
			} catch (TerminalException e) {
				System.out.println("Veuillez rentrer un type de données correct");
				correct = false;
			}
		} while (!correct);

	}

	static int division(int[] tab, int indice, int diviseur) throws ArithmeticException {
		return tab[indice] / diviseur;
	}

}
