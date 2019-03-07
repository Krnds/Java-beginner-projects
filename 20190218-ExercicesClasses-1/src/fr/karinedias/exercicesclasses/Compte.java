package fr.karinedias.exercicesclasses;

class Compte {

	int solde = 0;
	String titulaire;
	String numero;

	// constructeur de la classe Compte :
	// permet d'avoir plusieurs façons de créer un objet
	public Compte(String titulaireCompte) {

		solde = 0;
		titulaire = titulaireCompte;
	}

	void set(String nom) {
		// mutateur pour changer le nom du titulaire
		titulaire = nom;

	}

	void deposer(int montant) {
		solde = solde + montant;
	}

	void retirer(int montant) {
		solde = solde - montant;
	}

	void virerVers(int montant, Compte destination) {
		this.retirer(montant);
		destination.deposer(montant);
	}

	void afficher() {
		Terminal.ecrireString("solde du compte de " + titulaire + " : " + solde + " €");
	}

	public static void main(String[] args) {
		Compte compte01 = new Compte("Alain");
		Compte compte02 = new Compte("Lucien");
		compte01.deposer(60);
		compte01.virerVers(35, compte02);
		compte01.afficher();

	}
}
