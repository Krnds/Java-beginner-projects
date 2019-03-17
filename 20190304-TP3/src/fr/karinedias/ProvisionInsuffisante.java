package fr.karinedias;

public class ProvisionInsuffisante extends RuntimeException {

	private double solde;

	public ProvisionInsuffisante() {
		System.out.println("Le solde est insuffisant pour la quantité voulue.");
	}

	public double getSolde() {
		return this.solde;
	}
}
