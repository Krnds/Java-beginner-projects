package fr.karinedias;

public class CompteEpargne extends Comptes {

	private static final double TAUX = 0.0075; // pour tous les CE

	public CompteEpargne(double soldeInitial, String titulaire) {
		super(soldeInitial, titulaire);
		// TODO Auto-generated constructor stub
	}
	
	public void crediterInterets() {
		this.solde += this.solde * TAUX;
	}

}
