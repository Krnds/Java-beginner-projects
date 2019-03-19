package fr.karinedias;

public class Image {

	public int largeurImage;
	public int hauteurImage;
	// public int[][] pixelsImage;
	public int[] couleur; // dans la classe pixel plutôt ?

	// public Image(int[][][] image) {
	//
	// this.hauteurImage = image.length;
	// this.largeurImage = image[0].length;
	//
	// }

	public Image(int[][][] pic) {

		this.hauteurImage = pic.length;
		this.largeurImage = pic[0].length;

	}

	public int[][] pixelImage(int[][][] pic) {
		int[][] pixelPic = new int[this.hauteurImage][this.largeurImage];

		return pixelPic;
	}

	public int getHauteur() {
		return this.hauteurImage;
	}

	public int getLargeur() {
		return this.largeurImage;
	}

	public static int[] gris(int[][] pixelsImage) {
		int[] pixelsGris = new int[pixelsImage.length * pixelsImage[0].length];
		// int moyenneGris = (rouge + bleu + vert) / 3;
		return pixelsGris;
	}

	/*
	 * lle retourne un tableau d'entiers à trois dimensions (donc de typ e int[][][]
	 * ) représentant l'image qui a été lue. Plus précisément, si t désigne le
	 * tableau retourné par cette fonction :  t[i][j][0] désigne le niveau de rouge
	 * du pixel (i,j) de l'image  t[i][j][1] désigne le niveau de vert du pixel
	 * (i,j) de l'image  t[i][j][2] désigne le niveau de bleu du pixel (i,j) de
	 * l'image  t.length désigne la hauteur de l'image (son nombre de lignes) 
	 * t[0].length désigne la largeur de l'image (son nombre de colonnes)
	 */
}
