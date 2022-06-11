package fr.tp03.exercices.autoformation;

public class AffichagePartiel {

	public static void main(String[] args) {

		// ------------------------------------------------------------------------------
		// 3.EXERCISE PARTIAL DISPLAY
		// ------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		System.out.println("3.Exercise Partial Display");
		System.out.println("---------------------------------------------------------");
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Combine a loop and a test to display only integers greater than 3
		System.out.println("---------------------------------------------------------------------");
		System.out.println("3.1.Combine a loop and a test to display only integers greater than 3");
		System.out.println("---------------------------------------------------------------------");
		for (int i : array) {
			if (i > 3) {
				System.out.println(i);
			}
		}

		// Combine a loop and a test to display only even integers
		System.out.println("---------------------------------------------------------------------");
		System.out.println("3.2.Combine a loop and a test to display only even integers");
		System.out.println("---------------------------------------------------------------------");
		for (int i : array) {
			if (i % 2 == 0 & i != 0) {
				System.out.println(i);
			}
		}

		// Combine a loop and a test to display only even integers
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
		System.out.println(
				"3.3.Combine a loop and a test in order to display only the values corresponding to the even indexes");
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
		for (int index = 0; index < array.length; index++) {
			if (index % 2 == 0 & index != 0) {
				System.out.println("Index " + index + " = " + array[index]);
			}
		}

		// Combine a loop and a test to display only odd integers
		System.out.println("---------------------------------------------------------------------");
		System.out.println("3.4.Combine a loop and a test to display only odd integers");
		System.out.println("---------------------------------------------------------------------");
		for (int i : array) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
