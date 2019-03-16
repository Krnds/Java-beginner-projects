package fr.karinedias;

public class ProvisionInsuffisante extends RuntimeException {

	private double solde;

	public ProvisionInsuffisante() {
		
	}

	public double getSolde() {
		return this.solde;
	}
}
