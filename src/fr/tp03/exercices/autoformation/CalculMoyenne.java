package fr.tp03.exercices.autoformation;

public class CalculMoyenne {

	public static void main(String[] args) {
		// ------------------------------------------------------------------------------
		// 5.AVERAGE CALCULATION
		// ------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		System.out.println("5.AVERAGE CALCULATION");
		System.out.println("---------------------------------------------------------");
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		float average = (float) sum / array.length;
		System.out.print("Moyenne = " + average);

	}

}
