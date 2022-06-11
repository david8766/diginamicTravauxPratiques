package fr.tp02.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		// Declaration of variables
		byte b = 12;
		short s = 1978;
		int i = 192569;
		long l = 12356L;
		float f = 2.8F;
		double d = 23.6D;
		char c = 'd';
		boolean bool = true;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);

		System.out.println("---------------------------------------------------");

		// Declaration of a variable

		String randomString = "Voici le résultat d'un calcul : \n1+5=6.";
		System.out.println(randomString);
	}

}
