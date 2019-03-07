package fr.karinedias;

public class MaDate1 {

	private int jour;
	private Mois mois;
	private Annee annee;

	public MaDate1 (int jour, Mois mois, Annee annee) {

		if (jour <0 || jour > mois.nbJours(anee)) {
		    throw new Error ("jour incorrect");
		}

		this.jour = jour;
		this.mois = mois;
		this.annee = annee;

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void affichage() {
		System.out.println("jour");
		jour.affichage();
		System.out.println("mois");
		mois.affichage();
	}

	public MaDate1 jourSuivant() {
		int j1;
		Mois m1 = this.mois;
		Annee a1 = this.annee;

		if (!mois.dernierJour(this.jour, this.mois)) {
		    j1 = this.jour + 1; //appliquer jour à this
		} else {
		    m1 = this.mois.suivant();
		    if (this.mois.estDernier()) {
			a1 = this.annee.suivant();
		    }
		}
		return new MaDate1(j1; m1; a1);
	    }

}
