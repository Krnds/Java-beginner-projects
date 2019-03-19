package fr.karinedias;

public class Pixel extends Image {

	public static int rouge;
	public static int bleu;
	public static int vert;
	public int[] couleur;
	public int tabPixels;

	public int[] couleur(int r, int v, int b) {

		if (couleurCorrecte(r))
			this.rouge = r;
		if (couleurCorrecte(v))
			this.vert = v;
		if (couleurCorrecte(b))
			this.bleu = b;

		this.couleur = couleur;
		couleur = new int[] { r, v, b };

		return couleur;

	}

	public Pixel(int[][][] pic) {
		super(pic);

	}

	private boolean couleurCorrecte(int couleur) {
		// déclarée private car appelée depuis le constructeur.
		boolean correct = false;
		if (couleur < 0 || couleur > 255) {
			throw new IllegalArgumentException("Les niveaux de couleurs doivent être compris entre 0 et 255.");
		} else {
			correct = true;
		}
		return correct;
	}

	public int getRouge() {
		return this.rouge;
	}

	public int getBleu() {
		return this.bleu;
	}

	public int getVert() {
		return this.vert;
	}

	public void setCouleur(int[] nouvelleCouleur) { //ne sert à rien
		this.couleur = nouvelleCouleur;
	}

	// en
	// rendant
	// jaunes
	// tous
	// les
	// pixels
	// de
	// l'image
	// comportant
	// plus
	// de
	// 40%
	// de
	// vert

}
