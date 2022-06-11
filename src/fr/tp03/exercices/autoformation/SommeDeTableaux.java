package fr.tp03.exercices.autoformation;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// ------------------------------------------------------------------------------
		// 5.SUM OF TABLES
		// ------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		System.out.println("5.SUM OF TABLES");
		System.out.println("---------------------------------------------------------");
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };
		int lenghtArray1 = array1.length;
		int lenghtArray2 = array2.length;
		int[] concate = new int[lenghtArray1 + lenghtArray2];
		System.arraycopy(array1, 0, concate, 0, lenghtArray1);
		System.arraycopy(array2, 0, concate, lenghtArray1, lenghtArray2);
		int sum = 0;
		for (int i : concate) {
			sum += i;
		}
		System.out.println("Sum of the two tables: " + sum);

	}

}
