package fr.karinedias;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inscription {

	private String nom;
	protected String codeUE;
	private int anneeInscription;
	private int semestreInscription;
	private double noteSemestre1, noteSemestre2;

	public Inscription(String nomAuditeur, String codeUE, int anneeInscription, int semestreInscription) {
		this.nom = nomAuditeur;
		this.codeUE = codeUE;
		this.anneeInscription = anneeInscription;
		this.semestreInscription = semestreInscription;
	}
	
	//constructeur vide :
	public Inscription() {
		
	}

	public double[] saisirResultat(String nom) {

		Scanner sc = new Scanner(System.in);
		double[] tabNotes = new double[2];
		double noteSem1, noteSem2;

		try {
			System.out.println("Quelle est la note obtenue au 1er semestre ?");
			tabNotes[0] = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("La note doit être un nombre");
		}
		tabNotes[0] = this.noteSemestre1;

		try {
			System.out.println("Quelle est la note obtenue au 2eme semestre ?");
			tabNotes[1] = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("La note doit être un nombre");
		}
		tabNotes[1] = this.noteSemestre2;

		return tabNotes;

	}

	public boolean validation(String nomUE) {
		boolean pass = false;

		while (ueValide()) {
			if (saisirResultat(this.nom)[0] >= 10 && saisirResultat(this.nom)[1] >= 10)
				pass = true;
		}
		return pass;

	}

	// méthode supplémentaire pour contrôler les codes des UE :
	public boolean ueValide() {

		Pattern p = Pattern.compile("[A-Z]{3}[0-9]{3}");
		Matcher m = p.matcher(this.codeUE);
		boolean valide = m.matches();

		return valide;
	}

	// méthode supplémentaire pour contrôler le bon format des notes (entre 0 et 20)
	// :

	public boolean noteValide(double note) {
		boolean valide;

		if (note > 20 && note < 0) {
			valide = false;
			throw new IllegalArgumentException("Attention la note doit être comprise entre 0 et 20");
		} else {
			valide = true;
		}

		return valide;
	}

	public String toString() {
		return "L'auditeur : " + this.nom + " incrit pour l'UE " + this.codeUE + " au semestre "
				+ this.semestreInscription;
	}

	// setter
	public void setCodeUE(String code) {
		codeUE = code;
	}

	// getters
	public String getNom() {
		return this.nom;
	}

	public int getSemestreInscription() {
		return this.semestreInscription;
	}

	public int getAnneeInscription() {
		return this.anneeInscription;
	}

	public String getCodeUE() {
		return this.codeUE;
	}

	public double getNoteSemestre1() {
		return this.noteSemestre1;
	}

	public double getNoteSemestre2() {
		return this.noteSemestre2;
	}

}
