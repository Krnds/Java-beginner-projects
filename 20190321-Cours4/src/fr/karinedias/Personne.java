package fr.karinedias;

public class Personne {

	private String nom, prenom;
	private int anneeNaissance;

	public Personne(String nom, String prenom, int anneeN) {
		this.nom = nom;
		this.prenom = prenom;
		this.anneeNaissance = anneeN;
	}

	public String toString() {
		return nom + " " + prenom + " né en " + anneeNaissance;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public int getAnneeNaissance() {
		return this.anneeNaissance;
	}
}
