package fr.karinedias.utils;

public class PrintArrays {

	
	public static void print1DAarray(Object[] tab) {
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
	
	public static void print2DArray(Object[][] tab) {
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				System.out.println(tab[i][j]);
			}
		}
	}

}
