package fr.tp03.exercices.autoformation;

import java.util.Arrays;

public class FirstLast6 {

	// Verify Array
	// We calculate a Boolean value that controls the array like this:
	// it is true if the array has at least 1 element and if the first element or
	// the last element is 6.
	// it is false in the other cases

	/**
	 * Verify Array
	 * 
	 * @param arr
	 * @return boolean
	 */
	private static boolean checkArray(Integer[] arr) {
		int lenghtArray = arr.length;
		int firstNum = arr[0];
		int lastNum = arr[arr.length - 1];

		if (lenghtArray > 0 && firstNum == 6 || lastNum == 6) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// ------------------------------------------------------------------------------
		// 8.FIRST LAST 6
		// ------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		System.out.println("8.FIRST LAST 6");
		System.out.println("---------------------------------------------------------");
		// In this class, we declare an array of integers
		Integer[] array1 = { 6, 2, 3, 4, 6 };
		Integer[] array2 = { 1, 2 };

		System.out.println("array1 : " + Arrays.asList(array1));
		System.out.println("array2 : " + Arrays.asList(array2));

		System.out.println("Array1: " + checkArray(array1));
		System.out.println("Array2: " + checkArray(array2));

	}

}
