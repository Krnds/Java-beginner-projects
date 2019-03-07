package fr.karinedias.annales;

public class ExoBoucles {

	public static void main(String[] args) {
		
		for (int i = 0; i < 1; i++) {
			System.out.println('*');
			for (int j = 1; j < 8; j++) {
				System.out.print('=');
				for (int k = 1; k < j; k++) {
					System.out.println('=');
				}
			}
		}

	}
}

/*
*
=***
==*****
===*******
====*********
=====***********
======*************
=======***************
 */

