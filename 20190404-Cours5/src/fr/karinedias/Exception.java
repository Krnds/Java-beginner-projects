package fr.karinedias;

public class Exception {

	public static void m2(int x, int y) {

		m3(x, y);
	}

	public static void m1(int x, int y) {
		m2(x, y);
	}

	public static void m3(int x, int y) {
		// affichage
	}

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		m1(a, b);
		System.out.println("Fin normale du programme main");
	}

}
