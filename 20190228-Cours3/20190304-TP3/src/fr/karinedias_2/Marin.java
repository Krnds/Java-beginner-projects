package fr.karinedias_2;
import java.util.ArrayList;
import java.util.List;

public class Marin {

	boolean statut; //sur bateau ou sur le port : true/false
	String nom;
	char fonction; //travaille sur le port ou sur un bateau : [p/b]

	//constructeur
	public Marin (String nomMarin, char fonctionMarin) {
		this.nom = nomMarin;
		this.fonction = fonctionMarin;
	}


	//méthode pour vérifier que sa fonction est correcte AKA soit p (port) ou b (bateau)
	public boolean statutEstCorrect(char statut) {

		boolean correct = false;
		//changer paramère statut car porte à confusion avec la valeur booléenne
		if (statut == 'p') {
			correct = true;
		} else if (statut == 'b') {
			correct = true;
		}
		return correct;
	}


	public boolean estDisponible(boolean statut) {

		if (this.statut) {
			return false; //est sur bateau donc non dispo
		} else {
			return true; //est sur le port donc dispo
		}
	}

	//GETTERS :
	public String getNom() {

		return this.nom;
	}

	public char getFonction() {

		return this.fonction;
	}

	//Nouveaux objets Marin :
	public static void main(String[] args) {

		Marin marin1 = new Marin("Guillaume", 'p');
		Marin marin2 = new Marin("Béatrice", 'b');
		Marin marin3 = new Marin("Lucie", 'p');

		List<Marin> listeMarins = new ArrayList();

		listeMarins.add(marin1);
		listeMarins.add(marin2);
		listeMarins.add(marin3);

		for (int i = 0; i < listeMarins.size(); i++) {
			System.out.print(listeMarins.get(i).nom + " ");
			System.out.println(listeMarins.get(i).statut);
		}
		
		
		
	}
	
}
