package fr.karinedias;

import java.util.Scanner;

public class Comptes {

	private int numero;
	private static int prochainNumero = 1;
	public double solde;
	public String titulaire;

	public Comptes(double soldeInitial, String titulaire) {
		// constructeur de la classe Comptes, permet de créer une instance de cette
		// classe
		// et donc une allocation mémoire dans le tas (heap)

		this.numero = Comptes.prochainNumero;
		prochainNumero++;
		this.solde = soldeInitial;
		this.titulaire = titulaire;
		// this indique l'instance courante de l'objet de la classe Comptes
	}

	public static Comptes creerCompte() {
		Scanner sc = new Scanner(System.in);
		String titulaire;
		System.out.println("Titulaire ?");
		titulaire = sc.nextLine();

		if (!titulaire.equals("")) {
			return new Comptes(0, titulaire);
		} else {
			throw new IllegalArgumentException("Le titulaire dit avoir un nom");
		}
	}

	// les getters ou setters permettent de récupérer les valeurs des var
	public double getSolde() {
		return this.solde;
	}

	public int getnum() {
		return this.numero;
	}

	public String getTitulaire() {
		return this.titulaire;
	}

	void deposer(int montant) {
		solde += montant;
	}

	void retirer(int montant) {
		if (this.solde >= montant) {
			this.solde -= montant;
		} else
			throw new ProvisionInsuffisante();
		
	}

	void afficher() {
		System.out.println(
				"Le compte n° " + this.numero + " appartenant à " + this.titulaire + " a un solde de : " + this.solde);
	}

	void virerVers(int numeroCompte, int numerocompteDestinataire, double montant) {

		this.numero = numerocompteDestinataire;
		this.numero = numerocompteDestinataire;

	}

}
