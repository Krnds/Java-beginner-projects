package fr.karinedias;

public class OperationsSurComptes {

	
	public static void main(String[] args) {
		//création d'objets Comptes :
		Comptes compte1 =  new Comptes(001, 25, "Robert");
		Comptes compte2 = new Comptes(002, 178, "Alain");
		Comptes compte3 = new Comptes(005, 2160.30, "Sarah");
		
	 compte1.deposer(250);
	 System.out.println("Voici l'affichage du solde : ");
	 compte1.afficher();
	 	
	}
}
