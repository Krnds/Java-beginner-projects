package fr.karinedias;

public class Employe extends Personne {
	// variables d'instances
	protected static int matricule;
	private int indice;
	protected static String service;

	// variable statique ou variable de classe : (on peut la modifier)
	private static double pointIndice = 4;
	private static int compteurMatricule = 0;
	/*
	 * TODO: gérer l'unicité de l'attribution des matricules
	 */

	public Employe(String nom, String prenom, String service, int matricule, int anneeN, int indice) {
		super(nom, prenom, anneeN);

		this.service = service;
		this.matricule = matricule;
		this.indice = indice;
		Employe.compteurMatricule++;
	}

	public String getService() {
		return this.service;
	}

	public int getMatricule() {
		return this.matricule;
	}

	public double getSalaire() {
		return indice * pointIndice;
	}

	public void setService(String nouveauService) {
		this.service = nouveauService;
	}

	public String toString() {
		return getNom() + " " + getPrenom() + ", matricule " + this.matricule + " travaillant dans le service : "
				+ this.service + " et né(e) en " + getAnneeNaissance() + " ayant comme indice " + indice
				+ " et comme salaire : " + getSalaire();
	}

	public static void main(String[] args) {
		Employe a = new Employe("Leduc", "Pascale", "biochimie", 0024, 1978, 238);
		Personne per = a;
		Object obj = a; //superclasse de tous les objets
		System.out.println(a.toString() + "\n" + obj.toString() + "\n" + per.toString());
		a.setService("Genomique constitutionnelle");
		System.out.println(a.toString());
	}

}
