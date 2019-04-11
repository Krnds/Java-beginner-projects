package fr.karinedias.chaperonrouge;

public class Humain extends Etre{

	public Humain(String nom) {
		super(nom);
		
	}
	
	public void manger(Object obj) {
		Nourriture nourriture = (Nourriture) obj; 
		nourriture.consommer();
	}
	
	public void consommer() {
		
	}
}
