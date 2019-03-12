package fr.karinedias.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Import {

	public static void main(String[] args) throws IOException {

		BufferedReader csvReadLines = null;

		String line;
		String path = "/home/karine/src/java/Java-beginner-projects/20190317-TP4/bin/fr/karinedias/utils/books_new.csv";

		try {
			csvReadLines = new BufferedReader(new FileReader(path));

			while ((line = csvReadLines.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException exception) {
			System.out.println("File not found. Please check the path.");
		}

		//reécrire cette partie
		if (csvReadLines.readLine() != null) {
			if (csvReadLines.readLine().toLowerCase().startsWith("title")) {
				String[] csv = csvReadLines.readLine().split("\n", 2);
				System.out.println(csv.toString());
			}
		}

		csvReadLines.close();
	}


	public static boolean startwithIgnoreCase(String firstLine) {
		//méthode qui ne fonctionne pas quand elle est appelée : à chercher

		boolean ignore= false;

		if (firstLine.toLowerCase().startsWith("title")) {
			ignore = true;
		}
		return ignore;
	}
	
	public static ArrayList<String> getBookParameters () {
		
		ArrayList<String> bookParameters = new ArrayList<String>();
		//stocker dans cet arraylist les paramètres de chaque livre
		return bookParameters;
		
	}
	
	public static String[][] getBook(String file) {
		
		
		BufferedReader csvReadLines = null;

		String line;
		String path = "/home/karine/src/java/Java-beginner-projects/20190317-TP4/bin/fr/karinedias/utils/books_new.csv";

		try {
			csvReadLines = new BufferedReader(new FileReader(path));

			while ((line = csvReadLines.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException exception) {
			System.out.println("File not found. Please check the path.");
		}
		
		//compter le nombre de lignes du fichier
//		int lines = 0;
//		while (br.reader != null) {
//			lines++;
//		}
//		reader.close();
//		String[][] book = new String[lines][6];
//		
//		return book;
	}
}


/*
 * TODO: cf. todo.org file
 * 
 * for counting lines in BR : https://stackoverflow.com/questions/1277880/how-can-i-get-the-count-of-line-in-a-file-in-an-efficient-way
*/

//BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
//int lines = 0;
//while (reader.readLine() != null) lines++;
//reader.close();
