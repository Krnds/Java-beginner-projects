package fr.karinedias;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class PPM {

	/**
	 * Lit un fichier texte au format PPM et renvoie l'image correspondante sous la
	 * forme d'un tableau d'entiers à trois dimensions. Si t désigne le tableau
	 * retourné, t[i][j][0] représente le niveau de rouge du pixel (i,j) de l'image
	 * t[i][j][1] représente le niveau de vert du pixel (i,j) de l'image t[i][j][2]
	 * représente le niveau de bleu du pixel(i,j) de l'image Enfin, le nombre de
	 * lignes de l'image est t.length et le nombre de colonnes t[0].length
	 * 
	 * @param cheminFichier
	 *            : chemin du fichier à écrire ex windows :
	 *            "C:\\Users\\Eric\\Desktop\\sortie.ppm" ex linux :
	 *            "/home/Eric/sortie.ppm"
	 * @param t
	 *            :
	 */
	public static int[][][] lireFichier(String cheminFichier) {
		BufferedReader lecteur = null;
		String ligne;
		int nbCol = 0, nbLig = 0, maxP = 255;
		int cpt;
		int[] tabValeurs = new int[0];

		try {
			lecteur = new BufferedReader(new FileReader(cheminFichier));
			ligne = lecteur.readLine(); // lecture du symbole P3
			nbCol = Integer.parseInt(lecteur.readLine());
			nbLig = Integer.parseInt(lecteur.readLine());
			maxP = Integer.parseInt(lecteur.readLine());
			tabValeurs = new int[3 + nbLig * nbCol * 3];
			tabValeurs[0] = nbCol;
			tabValeurs[1] = nbLig;
			tabValeurs[2] = maxP;
			cpt = 3;

			while (((ligne = lecteur.readLine()) != null) && (cpt < 3 + nbLig * nbCol * 3)) {
				tabValeurs[cpt] = Integer.parseInt(ligne);
				cpt++;
			}
			lecteur.close();
		} catch (FileNotFoundException exc) {
			System.out.println("Erreur d'ouverture");
		} catch (IOException e) {
			System.out.println("Erreur lecture de ligne");
		}

		int[][][] t = new int[nbLig][nbCol][3];
		int k = 3, nbPixParLigne = 0, numLigne = 0, numCol = 0;
		while (k < tabValeurs.length) {
			t[numLigne][numCol][0] = tabValeurs[k];
			t[numLigne][numCol][1] = tabValeurs[k + 1];
			t[numLigne][numCol][2] = tabValeurs[k + 2];
			k += 3;
			nbPixParLigne++;
			if (nbPixParLigne == nbCol) {
				numLigne++;
				numCol = 0;
				nbPixParLigne = 0;
			} else
				numCol++;
		}
		return t;
	}

	/**
	 * Ecrit un fichier texte au format PPM à partir d'un tableau contenant toutes
	 * les valeurs entières à écrire dans le fichier après le code P3. Les 3
	 * premières valeurs du tableau sont le nombre de colonnes, le nombre de lignes
	 * et la valeur maximale de chaque couleur (ex : 255) puis la succession des
	 * niveaux r v b de chaque pixel
	 * 
	 * @param cheminFichier
	 *            : chemin du fichier à écrire ex windows :
	 *            "C:\\Users\\Eric\\Desktop\\sortie.ppm" ex linux :
	 *            "/home/Eric/sortie.ppm"
	 * @param t
	 *            :
	 */
	public static void ecrireFichier(String cheminFichier, int[][][] t) {
		int nbLig = t.length;
		int nbCol = t[0].length;
		BufferedWriter ecrivain = null;

		try {
			ecrivain = new BufferedWriter(new FileWriter(cheminFichier));
			ecrivain.write("P3\n" + nbCol + "\n" + nbLig + "\n" + "255\n");
			for (int i = 0; i < nbLig; i++) {
				for (int j = 0; j < nbCol; j++) {
					ecrivain.write("" + t[i][j][0] + "\n");
					ecrivain.write("" + t[i][j][1] + "\n");
					ecrivain.write("" + t[i][j][2] + "\n");
				}
			}
			ecrivain.close();
		} catch (FileNotFoundException exc) {
			System.out.println("Erreur d'ouverture");
		} catch (IOException e) {
			System.out.println("Erreur écriture de ligne");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Erreur : le tableau n'est pas au bon format.");
		}

	}

}
