package fr.karinedias;

public class TraitementImage {

	/*
	 * écrivez une méthode main() dans laquelle vous lirez le fichier perruche.ppm
	 * que vous trouverez sur le site du cours au moyen de la méthode statique
	 * PPM.lireFichier(). Créez un objet de votre classe Image correspondant à cette
	 * image
	 */

	public static void main(String[] args) {

		// création de l'objet Image :
		Image perruche = new Image(PPM.lireFichier(
				"/home/karine/src/java/Java-beginner-projects/20190318-TP7/bin/fr/karinedias/perruche.ppm"));

	}

	public void noirEtBlanc(int[][][] image) {
		/*
		 * transformer l'image en noir et blanc : chaque pixel est remplacé par le
		 * triplet ( m, m, m ) où m désigne la moyenne de ses niveaux de rouge, vert et
		 * bleu :
		 */
		
		
	}
}
