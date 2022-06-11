package fr.tp03.exercices.autoformation;

import java.util.Arrays;

public class FisrtLast {

	// Verify Array
	// We calculate a Boolean value that controls the array like this:
	// it is true if the length of the array is greater than or equal to 1 and the first and last element of the array have the same value.
	// it is false in the other cases
	
	
	/** Verify Array
	 * @param arr
	 * @return boolean
	 */
	private static boolean checkArray(Integer[] arr) {
		int lenghtArray = arr.length;
		int firstNum = arr[0];
		int lastNum = arr[arr.length-1];
		
		if (lenghtArray > 1 && firstNum == lastNum) {
			return true;
		} else {
			return false;
		}		
		
	}

	public static void main(String[] args) {
		//------------------------------------------------------------------------------
		// 9.FIRST LAST
		//------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		System.out.println("9.FIRST LAST");
		System.out.println("---------------------------------------------------------");
		//In this class, we declare an array of integers
		Integer[] array1 = {6,2,3,4,0};
		Integer[] array2 = {1,2,1};
		
		System.out.println("array1 : " + Arrays.asList(array1));
		System.out.println("array2 : " + Arrays.asList(array2));
		
		System.out.println("Array1: "+checkArray(array1));
		System.out.println("Array2: "+checkArray(array2));
		
	}

}
