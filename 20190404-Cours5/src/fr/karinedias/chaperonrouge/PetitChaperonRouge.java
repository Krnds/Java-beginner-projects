package fr.karinedias.chaperonrouge;

import java.util.Set;

public class PetitChaperonRouge extends Humain{
	
	public static void main(String[] args) {
		Humain petitChapetonRouge = new Humain("Chaperon Rouge");
		Nourriture galette = new Nourriture();
		Humain grandMere = new Humain("Grand Mere");
		grandMere.manger(galette);
		System.out.println(galette);
		grandMere.manger(petitChapetonRouge); //ne va pas fonctionner
	}

	
	public PetitChaperonRouge() {
		// TODO Auto-generated constructor stub
		super(nom); //pourquoi ne fonctionne pas ?
	}
 @Override
public String toString() {
	if (Nourriture.consommer)) {
		return "Il n'y en a plus";
	} else {
		return "Appétissant";
	}
}
}
