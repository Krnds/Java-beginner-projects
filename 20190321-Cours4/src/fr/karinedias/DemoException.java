package fr.karinedias;

public class DemoException {

	public static void main(String[] args) {
		IllegalArgumentException exc = new IllegalArgumentException("blabla");

		try {
			if (Math.random() < 0.5)
				throw exc;
		} catch (MonException nomException) {
			System.out.println(nomException.getCode());
			System.out.println(nomException.getMessage());
		} catch (IllegalArgumentException nomexception) {
			String str = nomexception.getMessage();
			System.out.println(str);
		} catch (Exception nomexception) {
			System.out.println("blabla");

		}
	}
}
