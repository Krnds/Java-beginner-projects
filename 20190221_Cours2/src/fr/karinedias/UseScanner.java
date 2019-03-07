package fr.karinedias;

import java.util.Scanner;;

public class UseScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x;
		String nom;

		// for (int i = 0; i < 5; i++) {
		// x = scan.nextInt();
		// System.out.println(x);
		// scan.nextLine();
		// System.out.println("Votre nom : ");
		// nom = scan.nextLine(); //attention s'arrête au caractère \n
		// System.out.println("Votre nom est" + nom);
		// }

		do {
			System.out.println("Entrez un nombre :");

			if (!(scan.hasNextInt())) {
				System.out.println("Veuillez rentre un nombre");
				scan.nextLine();
			}
		} while (!scan.hasNextInt());

		scan.close();
	}
}
