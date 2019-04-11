package fr.karinedias;

import java.util.ArrayList;

public class Auditeur {

	private String nom;
	private int INE;
	private ArrayList<Inscription> listeInscriptions;

	public Auditeur(String nom, int INE) {
		this.nom = nom;
		this.INE = INE;
	}

	public ArrayList<Inscription> ajoutInscription(Inscription ins) {

		/*
		 * TODO: /faire une arrayLIst d'inscriptions et +1 à chaque fois pour une
		 * nouvelle inscription /et renvoyer dans toString d'Auditeur l'instance
		 * Inscription contenue dans le tableau tabInscription
		 */

		ArrayList<Inscription> listeInscriptions = new ArrayList<Inscription>();
		listeInscriptions.add(ins);

		return listeInscriptions;

	}

	public String toString() {
		return this.nom + " n° " + this.INE + listeInscriptions.set(listeInscriptions.size(), Inscription  ).getCodeUE();// rajouter tabInscription[n].getCodeUE;
	}

	// setters
	public void setNom(String nouveauNom) {
		this.nom = nouveauNom;
	}

	// getters
	public String getNom() {
		return this.nom;
	}

	public int getINE() {
		return this.INE;
	}

	// méthode main
	public static void main(String[] args) {
		InscriptionCC inscriptionCC2 = new InscriptionCC("Paul", "NFA042", 2012, 2);
		inscriptionCC2.saisirResultat();
		System.out.println("Note d'examen : " + inscriptionCC2.getNom() + " " + inscriptionCC2.getNoteExamen());
		System.out.println("Note de contrôle continu : " + inscriptionCC2.getNoteControleContinu());
		Auditeur a1 = new Auditeur("Marie", 07);
		a1.toString();
	}

	/*
	 * TODO: Comment appeler l'accesseur getNom à partir de la classe InscriptionCC,
	 * elle-même fille d'Inscription (l'attribut Nom étant seulement présent dans la
	 * classe mère Inscription ? = réponse via le keyword "super" dans la subclass
	 */

}
