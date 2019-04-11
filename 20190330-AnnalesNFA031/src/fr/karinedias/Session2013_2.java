package fr.karinedias;

public class Session2013_2 {
	// à modifier car ne marche pas...

	/*
	 * pour la séquence AABAAACC, c’est A2BA3C2 qui est affiché
	 */

	public static String sequencesCaracteres() {
		int repet = 1;
		String seq = "AABAAACC";
		String res = " ";
		// seq = seq + (random() * 20);
		int seqLen = seq.length();

		for (int i = 0; i < (seqLen - 1); i++) {
			if (seq.charAt(i) == seq.charAt(i + 1)) {
				repet++;
				res = seq.substring(i, repet) + Integer.toString(repet);
			}
		}

		return res;
	}

	public static char random() {
		return (char) (65 + Math.random() * 5);
	}

	public static void main(String[] args) {
		// sequencesCaracteres();
		int repet = 1;
		String seq = "AABAAACC";
		String res = " ";

		for (int i = 0; i < (seq.length() - 1); i++) {
			String res1 = " ";
			if (seq.charAt(i) == seq.charAt(i + 1)) {
				repet++;
				res1 = seq.substring(i, (i + 1)) + Integer.toString(repet);
				res = res + res1;
			}
		}
		System.out.println(res);
	}
}