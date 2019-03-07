package fr.karinedias_2;

public class Bateau {

	private int capaciteMarin;
	private String type;
	private boolean dansPort; //savoir si le bateau est encore sur le port ou bien en mer
	
	//constrcuteur de la classe Bateau :
	public Bateau (String nom, String type, int capaciteTot, boolean dansPort) {
		
		this.capaciteMarin = capaciteTot;
		this.type = type;
		
	}
	
	public boolean estDisponible() {
		
		if (this.dansPort) {
			return true;
		} else {
			return false;
		}
	}
	
	
}