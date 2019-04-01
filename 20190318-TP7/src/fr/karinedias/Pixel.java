package fr.karinedias;

public class Pixel {
	
	//modifier car la structure de la classe est fausse...

	public static int rouge;
	public static int bleu;
	public static int vert;
	public static int[] couleur; //pourquoi static ?
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

	public Pixel(int[] couleur) {
couleur = this.couleur;
	}

	private boolean couleurCorrecte(int couleur) {
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



}
