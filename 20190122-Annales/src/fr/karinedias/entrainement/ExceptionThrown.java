package fr.karinedias.entrainement;

public class ExceptionThrown {

	static int divideByZero(int a, int b) {

		int i = a / b;

		return i;
	}

	static int computeDivision(int a, int b) {
		int res = 0;

		try {
			res = divideByZero(a, b);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception has occured.");
		}
		return res;
	}

	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		try {
			computeDivision(a, b);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is prohibided.");
		}
	}

}
