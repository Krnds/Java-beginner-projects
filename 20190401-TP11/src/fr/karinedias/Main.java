package fr.karinedias;

import java.util.Scanner;

public class Main {
	/*
	 * Ecrivez une methode main avec le cas d’un auditeur nomme Martin, ayant obtenu
	 * 12 en premiere session de NFA031 au premier semestre 2016/2017 et inscrit
	 * sans encore de note a NFA032 au second semestre 2017/2018.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Auditeur auditeur1 = new Auditeur("Martin", 0);
		Inscription inscriptionAuditeur1 = new Inscription("Martin", "NFA031", 2016, 1);


		Inscription[] tableau = new Inscription[3];
		tableau[0] = new Inscription("Alain", "NFA0003", 2017, 1);
		tableau[1] = new Inscription("Christelle", "NFA031", 2017, 2);
		tableau[2] = new Inscription("Damien", "NFA008", 2017, 2);

		for (int i = 0; i < 3; i++) {
			System.out.println("Veuillez rentrer les notes pour : " + tableau[i].getNom());
			tableau[i].saisirResultat(tableau[i].getNom()); // correct ?
			if (tableau[i].ueValide()) {
				System.out.println("Votre UE a été validée ! :D\n");
			} else {
				System.out.println("Malheureusement, il faudra repasser votre UE... :/\n");
			}
		}
		InscriptionCC inscriptionCC1 = new InscriptionCC("Thomas", "NFA035", 2015, 2);
		System.out.println("Veuillez rentrer les notes pour : " + inscriptionCC1.getNom());
		// double[] notesCC1 =
		inscriptionCC1.saisirResultat();
		System.out.println("Note à l'examen de l'auditeur : " + inscriptionCC1.getNom());
		System.out.println(inscriptionCC1.getNoteExamen());
		System.out.println("Note au CC de l'auditeur : " + inscriptionCC1.getNom());
		inscriptionCC1.getNoteControleContinu();

		sc.close();
	}
}