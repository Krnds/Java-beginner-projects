package fr.karinedias.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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


	public static boolean startwithIgnoreCase(String file) {
		//méthode qui ne fnctionne pas quand elle est appelée : à chercher

		boolean ignore= false;

		if (file.toLowerCase().startsWith("title")) {
			ignore = true;
		}
		return ignore;
	}
}

