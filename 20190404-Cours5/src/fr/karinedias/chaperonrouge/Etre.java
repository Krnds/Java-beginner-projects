package fr.karinedias.chaperonrouge;

abstract public class Etre {

	// sous-classes : grand-mère & petit chaperon rouge

	String nom;
	boolean vivant;

	public Etre(String nom) {
		this.nom = nom;
		this.vivant = true;
	}

	public void mourir() {
		if (!vivant) {
			throw new IllegalStateException("On ne peut mourir une seule fois");
		} else {
			vivant = false;
		}
	}

	public void manger(Object obj) {
		

	}
}
