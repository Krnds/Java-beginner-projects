package fr.karinedias;

public class Responsable extends Employe {

	private static int anneeN;
	private Employe[] equipe;

	public Responsable(String nom, String prenom, int indice) {
		super(nom, prenom, service, matricule, anneeN, indice);
		equipe = new Employe[0];
	}

	public Responsable(String nom, String prenom, int indice, Employe[] equipe, int anneeN) {
		super(nom, prenom, service, matricule, anneeN, indice);
		this.equipe = equipe;
	}

	public void newEmploye(Employe e) {
		/*
		 * TODO: faire ça avec une arrayList
		 */

		int taille = equipe.length;
		Employe[] copie = new Employe[taille + 1];
		for (int i = 0; i < taille; i++) {
			copie[i] = equipe[i];
			copie[taille] = e;
			equipe = copie;
		}
	}

	public String toString() {
		String str = super.toString();

		str += (" \n est le responsable direct de : " + "\n");
		for (int i = 0; i < equipe.length; i++) {
			str += equipe[i].getMatricule() + " ";
		}
		return str;
	}
	
	public static void main(String[] args) {
		/*
		 * TODO: à mettre dans la classe "main" 
		 */
		
		Responsable r1 = new Responsable("Fart", "Olive", 532);
		System.out.println(r1.toString());
		r1.newEmploye(new Employe("Rachel", "Dubois", "animalerie", 765, 1992, 112));
	}

}
