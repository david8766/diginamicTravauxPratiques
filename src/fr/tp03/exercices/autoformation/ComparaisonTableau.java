package fr.tp03.exercices.autoformation;

import java.util.HashSet;
import java.util.Set;

public class ComparaisonTableau {

	/**
	 * Find Common Elements
	 * 
	 * @param arr1
	 * @param arr2
	 */
	private static void findCommonElements(int[] arr1, int[] arr2) {
		// Check if length of arr1 is greater than 0
		// and length of arr2 is greater than 0
		System.out.println("Common elements:");
		if (arr1.length > 0 && arr2.length > 0) {
			Set<Integer> firstSet = new HashSet<Integer>();
			for (int i = 0; i < arr1.length; i++) {
				firstSet.add(arr1[i]);
			}

			// Iterate the elements of the arr2
			for (int j = 0; j < arr2.length; j++) {
				if (firstSet.contains(arr2[j])) {
					System.out.println(arr2[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// ------------------------------------------------------------------------------
		// 7.COMPARISON TABLE
		// ------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		System.out.println("7.COMPARISON TABLE");
		System.out.println("---------------------------------------------------------");
		int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		findCommonElements(array1, array2);
	}

}
