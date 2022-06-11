package fr.tp03.exercices.autoformation;

public class RechercheMin {

	public static void main(String[] args) {
		// ------------------------------------------------------------------------------
		// 4.MIN RESEARCH EXERCISE
		// ------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		System.out.println("4.MIN RESEARCH EXERCISE");
		System.out.println("---------------------------------------------------------");
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int minNum = array[0];
		for (int num : array) {
			if (num < minNum)
				minNum = num;
		}
		System.out.println("Minimum number = " + minNum);

	}

}
