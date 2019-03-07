package fr.krnds.cours12;

public class ExoStringArrayList {

	public static void main(String[] args) {
		System.out.println("Rentre un caractère");
		extraireCoor(Terminal.lireString());
	}

	public static void Test() {
		String s = "abcd";
		System.out.println("une chaîne de caractères");
		String s2 = Terminal.lireString();

		if (s.equals(s2))
			System.out.println("OK");
		else if (s.toUpperCase().equals(s2)) {
			System.out.println("oui");
		}
	}

	public static int[] extraireCoor(String inp) {
		int[] res = new int[2];
		inp = inp.toUpperCase().trim();
		String nLigne = "";
		int ind = 1;
		char Lettre = inp.charAt(0);
		res[0] = Character.getNumericValue(Lettre);
		while (inp.charAt(ind) != '=') {
			nLigne = nLigne + inp.charAt(Lettre);
			ind++;
		}
		res[1] = Integer.parseInt(nLigne);
		return res;
	}
}
