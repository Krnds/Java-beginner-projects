package fr.karinedias.session2016;

/**
 * @author karine
 *         {@linkhttp://deptinfo.cnam.fr/Enseignement/CycleA/APA/nfa032/docs/nfa032-2016-s1-1.pdf}
 */

enum Categorie {
	entree, plat, dessert
}

public class Plat {

	private String nom;
	private double prix;

	public Plat(String nom, double prix, Categorie c) {

		this.nom = nom;
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return this.nom + Categorie.valueOf(nom) + " coûte : " + this.prix + " €";
	}


	public static void main(String[] args) {

		Plat quicheLorraine = new Plat("Quiche lorraine", 11.5, Categorie.plat);
		Plat houmous = new Plat("houmous", 5.0, Categorie.entree);
		System.out.println(houmous.toString());
	}
}
