package fr.poo.tp01.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		System.out.println("Chronom�trage avec StringBuilder");
		long debut = System.currentTimeMillis();
		StringBuilder st = new StringBuilder();
		long num = 0;
		do {
			num = num + 1;
			st.append(Integer.toString((int) num));
		} while (num < 100001);
		long fin = System.currentTimeMillis();
		System.out.println("Temps �coul� en millisecondes :" + (fin - debut));
		
		System.out.println("Chronom�trage sans StringBuilder");
		long debut2 = System.currentTimeMillis();
		String string = "";
		for (int i = 1; i <= 100000; i++) {
			string = string + "-" + Integer.toString((int) i);
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps �coul� en millisecondes :" + (fin2 - debut2));
		System.out.println("------------------------------------------------");
		System.out.println("Le Temps �coul� est plus long sans StringBuilder");
		

	}

}
