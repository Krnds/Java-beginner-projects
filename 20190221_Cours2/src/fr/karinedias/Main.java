package fr.karinedias;

public class Main {

	public static void main(String[] args) {
		
		ComptesBancaires c1, c2;
		
		c1 = new ComptesBancaires("0001", "753");
		c2 = new ComptesBancaires("0002", "0");
		
		System.out.println(c1.toString());
		
		c1.deposit(600);
		double a = c1.getSolde();
	}

}
