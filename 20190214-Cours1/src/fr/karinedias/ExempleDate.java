package fr.karinedias;
import java.util.Date;

public class ExempleDate {

	public static void main(String[] args) {
		int jour;
		String monNom = "Karine";
		ExempleDate maDate = new ExempleDate();
		System.out.println(maDate);
		Date monAnniversaire = new Date ("July 30 1991");
		System.out.println(monAnniversaire);
		System.out.println("jour de mon anniversaire : " + monAnniversaire.getDate());
		System.out.println("mois de mon anniversaire : " + (monAnniversaire.getMonth()+ 1));
		//Attention Java compte les années à partir de 1900

		Date sunday = new Date (119, 1, 17);
		sunday.setDate(25);
		System.out.println(sunday);
		
		//comparer deux dates :
		if (sunday.before(monAnniversaire)) {
			System.out.println("Mon anninv est après le dimanche");
		} else {
			System.out.println("il est après");
		}
		
		System.out.println(sunday.getMonth());
	}
}
