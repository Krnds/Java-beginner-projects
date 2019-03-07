package fr.karinedias;

public class ComptesBancaires {

	private String owner;
	private String number;
	private double solde;
	
	public ComptesBancaires (String id, String num) {
		
		if (id == null || num == null || id.length()==0 || num.length()==0) {
			throw new RuntimeException();
		}
		
		owner = id;
		number = num;
		solde = 0.0;
	}
	
	public double getSolde() {
		//ACCESSEUR ou getter
		return solde;
	}
	
	public void deposit(double amount) {
		if (amount < 0)
			throw new RuntimeException();
		solde = amount + solde;
	}
	
	public void withdraw(double amount) {
		if (amount < 0)
			throw new RuntimeException();
		
		solde = solde - amount;
	}
	
	public String toString() {
		return "Compte " + number + " de " + owner + " a un solde de " + solde;
	}
	
}
