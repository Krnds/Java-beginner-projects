package fr.karinedias.chaperonrouge;

public class Nourriture {

	//sous-classes : galette & pot de beurre
	
	boolean consommer;
	
	Nourriture() {
		this.consommer = false;
	}
	
	public void consommer() {
		if (consommer) {
			consommer = true;
		} else {
			consommer = false;
		}
	}
}
