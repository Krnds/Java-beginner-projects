package fr.karinedias;

public class Comptes {

	private int numero;
	private double solde;
	private String titulaire;
	
	public Comptes(int numCompte, double soldeIntit, String tit) {
		//constructeur de la classe Comptes, permet de créer une instance de cette classe
		//et donc une allocation mémoire dans le tas (heap)
		
		this.numero = numCompte;
		this.solde = soldeIntit;
		this.titulaire = tit;
		//this indique l'instance courante de l'objet de la classe Comptes
	}
	
	
	//les getters ou setters permettent de récupérer 
	public double getSolde () {
		return solde;
	}
	
	public int getnum() {
		return numero;
	}
	
	void deposer(int montant) {
		solde += montant;
	}
	
	void retirer(int montant) {
		solde -= montant;
	}
	
	void afficher() {
		System.out.println("Le compte n° " + this.numero + " appartenant à " + this.titulaire 
				+ " a un solde de : " +  this.solde);
	}

	void virerVers(int numeroCompte, int numerocompteDestinataire, double montant) {
		
		this.numero = numerocompteDestinataire;
		this.numero = numerocompteDestinataire;
		
		
	}

}
