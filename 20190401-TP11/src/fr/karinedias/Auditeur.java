package fr.karinedias;

import java.util.ArrayList;

public class Auditeur {

	private String nom;
	private int INE;
	private static ArrayList<Inscription> listeInscriptions = new ArrayList<Inscription>(); // normalement ne devrait
																							// pas être statique car ce
																							// n'est pas une propriété
																							// communue à tous les
																							// objets Auditeur

	// constructeur avec Inscription
	public Auditeur(String nom, int INE, Inscription ins) {
		this.nom = nom;
		this.INE = INE;
		listeInscriptions.add(ins);

	}

	// constructeur sans Inscription
	public Auditeur(String nom, int INE) {
		this.nom = nom;
		this.INE = INE;
	}

	public static ArrayList<Inscription> ajoutInscription(Inscription ins) {
		//selon moi, mérite d'être statique

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
		// if (this.listeInscriptions.get(listeInscriptions.indexOf(nom)).getCodeUE() ==
		// null) {
		// return this.nom + " , n° INE : " + this.INE + " n'est inscrit à aucune UE
		// pour l'instant.";
		// } else
		return this.nom + " , n° INE : " + this.INE + " , inscrit(e) à l'UE : "
				+ listeInscriptions.get(listeInscriptions.indexOf(this.nom)).getCodeUE();
	}

	// setters
	public void setNom(String nouveauNom) {
		this.nom = nouveauNom;
	}

	public void setInscription(Inscription i) {
		// correct ?
		ajoutInscription(i);
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
		System.out.println("Note d'examen de " + inscriptionCC2.getNom() + " : " + inscriptionCC2.getNoteExamen());
		System.out.println("Note de contrôle continu : " + inscriptionCC2.getNoteControleContinu());
		Auditeur a1 = new Auditeur("Marie", 07, new Inscription("Marie", "BNF101", 2015, 2));
		// System.out.println(a1.toString());
		Auditeur a2 = new Auditeur("Charles", 8);
		// System.out.println(a2.toString());
		System.out.println(listeInscriptions.indexOf(a1));
		System.out.println(listeInscriptions.indexOf(a2));
		
	}

	/*
	 * TODO: Comment appeler l'accesseur getNom à partir de la classe InscriptionCC,
	 * elle-même fille d'Inscription (l'attribut Nom étant seulement présent dans la
	 * classe mère Inscription ? = réponse via le keyword "super" dans la subclass
	 */

	/*
	 * Attention listeInscriptions.indexOf(a1) et (a2) retournent -1 car ils ne sont
	 * pas trouvés dans l'ArrayList!
	 *
	 */

}
