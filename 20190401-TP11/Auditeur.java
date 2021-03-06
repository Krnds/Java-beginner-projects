package fr.karinedias;

import java.util.ArrayList;


public class Auditeur {

	private String nom;
	private int INE;
	private static ArrayList<Inscription> listeInscriptions = new ArrayList<Inscription>(); //à quoi sert-il car déjà la méthode ajoutInscription ??


	// constructeur sans inscription : 
	public Auditeur(String nom, int INE) {
		this.nom = nom;
		this.INE = INE;

	}
	// constructeur avec Inscription
	public Auditeur(String nom, int INE, Inscription ins) {
		this.nom = nom;
		this.INE = INE;
		listeInscriptions.add(ins);

}

	public static ArrayList<Inscription> ajoutInscription(Inscription ins) {

		
		//TODO : NE DOIT PAS ETRE STATIQUE CAR TOUS LES AUDITEURS N'ont pas d'ins
		//TODO: devrait utiliser la var di'nstance???? quoi faire ??
		/*
		 * TODO: /faire une arrayLIst d'inscriptions et +1 à chaque fois pour une
		 * nouvelle inscription /et renvoyer dans toString d'Auditeur l'instance
		 * Inscription contenue dans le tableau tabInscription
		 */

		ArrayList<Inscription> listeInscriptions = new ArrayList<Inscription>(); //nécessaire ? la var d'instance listeInscription existe déjà...
		listeInscriptions.add(ins);

		return listeInscriptions;

	}
	
	//méthode pour récupérer les index de mon ArrayList et savoir qui appeler dans la méthode toString :
	//inutile ?
	public void getIndexOfListeInscription() {
		//à revoir...
		for (int i = 0; i < listeInscriptions.size(); i++) {
			System.out.println(listeInscriptions.get(i));
		}
	}

	public String toString() {

		if (!listeInscriptions.contains(nom)) { //comment faire ?
			return this.nom + ", n° INE : " + this.INE + " , n'est inscrit(e) à aucune UE...";
		} else {
			return listeInscriptions.toString() + " numéro INE : " + this.INE;
		}
	}

	// setters
	public void setNom(String nouveauNom) {
		this.nom = nouveauNom;
	}

	public void setInscription(Inscription i) {
		listeInscriptions.add(i);
		//ou sinon appeler la méthode ajoutInscription() ?
	}

	// getters
	public String getNom() {
		return this.nom;
	}

	public int getINE() {
		return this.INE;
	}


	// méthode main
	public static void main(String[] args) {
		InscriptionCC inscriptionCC2 = new InscriptionCC("Paul", "NFA042", 2012, 2);
		inscriptionCC2.saisirResultat();
		System.out.println("Note d'examen de " + inscriptionCC2.getNom() + " : " + inscriptionCC2.getNoteExamen());
		System.out.println("Note de contrôle continu : " + inscriptionCC2.getNoteControleContinu());
		Auditeur a1 = new Auditeur("Marie", 07, new Inscription("Marie", "BNF101", 2015, 2));
		System.out.println(a1.toString());
		Auditeur a2 = new Auditeur("Charles", 8);
		System.out.println(a2.toString());
	
		
	}


	/*
	 * TODO: Comment appeler l'accesseur getNom à partir de la classe InscriptionCC,
	 * elle-même fille d'Inscription (l'attribut Nom étant seulement présent dans la
	 * classe mère Inscription ? = réponse via le keyword "super" dans la subclass
	 */

	/*
	 * Attention listeInscriptions.indexOf(a1) et (a2) retournent -1 car ils ne sont
	 * pas trouvés dans l'ArrayList!
	 *
	 */

}
