package fr.karinedias;

public class ObjetsMemoire {
	
	private int x;
	
	public ObjetsMemoire(int x) {
		this.x = x;
	}

	public static void main(String[] args) {

		int[] t1, t2, t3, t4, t5;
		t2 = new int[4];
		t3 = new int[4];
		t4 = new int[4];

		for (int i = 0; i < t3.length; i++) {
			t3[i] = 10 + i;
			t4[i] = 10 + i;
		}
		t5 = t4;
		affichage(t4);
		System.out.println();
		affichage(t5);
	
	}

	public static void affichage(int[] tab) {

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
	
	public static void couleurs() {
	 ObjetsMemoire var1, var2, var3;	
	 ObjetsMemoire2 cou1, cou2, cou3, cou4, cou5, cou6;
	 
	 var1 = new ObjetsMemoire(0);
	 var2 = new ObjetsMemoire(1);
	 cou2 = new ObjetsMemoire2(); //contient les VI premier & second = null
	 cou3 = new ObjetsMemoire2();
	 cou4 = new ObjetsMemoire2();
	 cou6 = new ObjetsMemoire2();
	 cou3.premier = var1;
	 cou3.second =  var2;
	 cou4.premier = var1;
	 cou4.second = var1;
	 cou5 = cou3;
	 cou6.premier = var1;
	 cou6.second = new ObjetsMemoire(2);
	}
}
