package fr.karinedias.livres;

import java.util.ArrayList;

public class Livre {

	private String titre;
	private String auteur;
	private double prix;
	private int nombreExemplairesStock;

	public static void main(String[] args) {
		// TEST
		Livre livre01 = new Livre("caca", "popo", 2.00, 3);
	}

	// constructeur
	public Livre(String titre, String auteur, double prix, int nombreExemplairesStcok) {

		if (prix < 0) {
			throw new IllegalArgumentException("Le prix doit être une valeur positive.");
		} else {
			this.prix = prix;
		}

		if (nombreExemplairesStcok < 0) {
			throw new IllegalArgumentException("Le nombre de livres restants doit être positif !");
		} else {
			this.nombreExemplairesStock = nombreExemplairesStcok;
		}
		this.titre = titre;
		this.auteur = auteur;
	}

	// accesseurs (get) affichage des données :

	public String getTitre() {
		return this.titre;
	}

	public String getAuteur() {
		return this.auteur;
	}

	public double getPrix() {
		return this.prix;
	}

	public static ArrayList<String> getBookParameters(Livre x) {
		
		// stocker dans cet arraylist les paramètres de chaque livre
		ArrayList<String> bookParameters = new ArrayList<String>();
		bookParameters.add(x.getTitre());
		
		return bookParameters;

	}

	public void affichage() {
		System.out.println("Le livre " + titre + " écrit par " + auteur);
		System.out.print(" coûte " + prix + " €.");

		// if (nombreExemplairesStock == 0)
		// tester si le nombre exemplaires est vide -> appel du paramètre p/r à quoi ?
	}

	// mutateurs (set) modifier les données :
	public void setPrix(String titre, String auteur, double nouveauPrix) {

		this.titre = titre;
		this.auteur = auteur;
		this.prix = nouveauPrix; // ?

	}
}

/*
 * TODO:
 */
