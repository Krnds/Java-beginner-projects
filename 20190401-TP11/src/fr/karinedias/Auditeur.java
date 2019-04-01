package fr.karinedias;

public class Auditeur {

	private String nom;
	private int INE;

	public Auditeur(String nom, int INE) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.INE = INE;
	}

	public String toString() {
		return this.nom + " n° " + this.INE; //+ Inscription.this.getCodeUE();
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
	
	//méthode main
	public static void main(String[] args) {
		InscriptionCC inscriptionCC2 = new InscriptionCC("Paul", "NFA042", 2012, 2);
		inscriptionCC2.saisirResultat();
		System.out.println("Note d'examen : " + inscriptionCC2.getNom() + inscriptionCC2.getNoteExamen());
		System.out.println("Note de contrôle continu : " + inscriptionCC2.getNoteControleContinu());
	}
	
	/*
	 * TODO: Comment appeler l'acsesseur getNom à partir de la classe InscriptionCC, elle-même fille d'Inscription (l'attribut Nom
	 * étant seulement présent dans la classe mère Inscription ?
	 */
	
}
