package fr.karinedias.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Import {

	private String path = "/home/karine/src/java/Java-beginner-projects/20190317-TP4/bin/fr/karinedias/utils/books_new.csv";

	public static boolean startwithIgnoreCase(String firstLine) {
		// méthode qui ne fonctionne pas quand elle est appelée : à chercher

		boolean ignore = false;

		if (firstLine.toLowerCase().startsWith("title")) {
			ignore = true;
		}
		return ignore;
	}

	public String[][] getBook() {

		
		String path = this.path;
		String line;
		int csvLength;
		BufferedReader csvReadLines = null;

		try {
			csvReadLines = new BufferedReader(new FileReader(path));

			while ((line = csvReadLines.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException exception) {
			System.out.println("File not found. Please check the path.");
		}
		
		//String[][] bookParameters = new String [][];

		// reécrire cette partie
//		if (csvReadLines.readLine() != null) {
//			if (csvReadLines.readLine().toLowerCase().startsWith("title")) {
//				String[] csv = csvReadLines.readLine().split("\n", 2);
//				System.out.println(csv.toString());
//			}

			// compter le nombre de lignes du fichier
			// int lines = 0;
			// while (br.reader != null) {
			// lines++;
			// }
			// reader.close();
			// String[][] book = new String[lines][6];
			//
			// return book;
		}
	}


/*
 * TODO: cf. todo.org file
 * 
 * Rewrite the import class :
a method for managing the csv file
a method for trimming the first line (fields)
a method for returning the file in an arraylist/or 2D String array
a method for returning the fields within the array giving a specific book
a method for returning the fields of a random book
Rewrite the import class with a correct structure (instance variables, constructor, protected stuff etc.)
 * for counting lines in BR : https://stackoverflow.com/questions/1277880/how-can-i-get-the-count-of-line-in-a-file-in-an-efficient-way
*/



//BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
//int lines = 0;
//while (reader.readLine() != null) lines++;
//reader.close();




//public static void main(String[] args) throws IOException {
//
//	BufferedReader csvReadLines = null;
//
//	String line;
//	String path = "/home/karine/src/java/Java-beginner-projects/20190317-TP4/bin/fr/karinedias/utils/books_new.csv";
//
//	try {
//		csvReadLines = new BufferedReader(new FileReader(path));
//
//		while ((line = csvReadLines.readLine()) != null) {
//			System.out.println(line);
//		}
//
//	} catch (FileNotFoundException exception) {
//		System.out.println("File not found. Please check the path.");
//	}
//
//	//reécrire cette partie
//	if (csvReadLines.readLine() != null) {
//		if (csvReadLines.readLine().toLowerCase().startsWith("title")) {
//			String[] csv = csvReadLines.readLine().split("\n", 2);
//			System.out.println(csv.toString());
//		}
//	}
//
//	csvReadLines.close();
//}
