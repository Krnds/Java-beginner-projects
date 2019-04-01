package fr.karinedias;

import java.util.InputMismatchException;

import java.util.Scanner;

public class InscriptionCC extends Inscription {
	
	private double noteExamen;
	private double noteControleContinu;

	public InscriptionCC(String nom, String codeUE, int anneeInscription, int semestreInscription) {
		super(nom, codeUE, anneeInscription, semestreInscription);
	}

	/*
	 * TODO: Question à poser : Si on créee un constructeur d'une classe fille avec
	 * des paramètres supplémentaires que ceux de la classe mère et qu'on appelle
	 * ensuite les paramètres de la classe mère avec "super", cela ne marche pas...
	 * POURQUOI ?
	 */

	public double[] saisirResultat() {
		// notes d'examen et de CC
		Scanner sc = new Scanner(System.in);
		double[] notes = new double[2];
		

		try {
			System.out.println("Veuillez rentrer la note d'examen obtenue :");
			notes[0] = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Veuillez rentrer un nombre sous la forme \"0,0\"");
		}
		this.noteExamen = notes[0];
		try {
			System.out.println("Veuillez rentrer la note de contrôle continu obtenue :");
			notes[1] = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Veuillez rentrer un nombre sous la forme \"0,0\"");
		}
		this.noteControleContinu = notes[1];
		return notes;
	}
	
	//getters
	public double getNoteExamen() {
		return this.noteExamen;
	}
	
	public double getNoteControleContinu() {
		return this.noteControleContinu;
	}
	
	public String getNom() {
		return this.getNom();
	}


}
