package fr.karinedias;

public class Pixel {

//	private int largeurImage;
//	private int hauteurImage;
	//à déclarer dans la classe Image !
	private int rouge;
	private int bleu;
	private int vert;
	private int[] couleur;

	public Pixel(int r, int v, int b) {

		if (couleurCorrecte(r))
			this.rouge = r;
		if (couleurCorrecte(v))
			this.vert = v;
		if (couleurCorrecte(b))
			this.bleu = b;

		this.couleur = couleur;
		couleur = new int[] { r, v, b };
	}

	private boolean couleurCorrecte(int couleur) {
		//déclarée private car appelée depuis le constructeur.
		boolean correct = false;
		if (couleur < 0 || couleur > 255) {
			throw new IllegalArgumentException("Les niveaux de couleurs doivent être compris entre 0 et 255.");
		} else {
			correct = true;
		}
		return correct;
	}
//	en
//	rendant
//	jaunes
//	tous
//	les
//	pixels
//	de
//	l'image
//	comportant
//	plus
//	de
//	40%
//	de
//	vert
	public void traitement(int r, int v, int b) {
		
	}

}
