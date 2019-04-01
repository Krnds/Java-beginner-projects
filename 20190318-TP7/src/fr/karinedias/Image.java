package fr.karinedias;

public class Image extends Pixel {

	public int largeurImage;
	public int hauteurImage;

	public Image(int[][][] fichierImage) {
		super(couleur);
		this.hauteurImage = fichierImage.length;
		this.largeurImage = fichierImage[0].length;
		// pic = [this.hauteurImage][this.largeurImage][this.couleur];
	}

	public int[][] pixelImage(int[][][] Image) {
		int[][] pixelPic = new int[this.hauteurImage][this.largeurImage];

		return pixelPic;
	}

	public int getHauteur() {
		return this.hauteurImage;
	}

	public int getLargeur() {
		return this.largeurImage;
	}

	public static int[][][] noirEtBlanc(int[][][] image) {
		/*
		 * transformer l'image en noir et blanc : chaque pixel est remplacé par le
		 * triplet ( m, m, m ) où m désigne la moyenne de ses niveaux de rouge, vert et
		 * bleu :
		 */
		int moyenneGris = (Pixel.rouge + Pixel.vert + Pixel.bleu) / 3;

		for (int i = 0; i < image.length; i++) {
		for (int j = 0; j < image[0].length; j++) {
			image[i][j][] = image[i][j][moyenneGris];
		}
		}
		return image;
	}

	// en rendant jaunes tous les pixels de l'image comportant plus de 40% de vert
	public static int[][][] transformeJaune(int[][][] image) {
		// à écrire
		return image;
	}

}
