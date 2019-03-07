package fr.karinedias;

public class Mois {

	private int numero;
	//garanti la sécurité du code et sa portée

	public Mois(int numero) {
		if (numero < 0 || numero > 12) {
			throw new Error("Le numéro du mois est incorect.");
		}

		this.numero = numero;
	}

	public Mois moisSuivant() {
		if (this.numero == 12)
			return new Mois(1);
		else
			return new Mois(this.numero);
	}
	
	public boolean estDernier() {
		return this.numero == 12;
	}
}
