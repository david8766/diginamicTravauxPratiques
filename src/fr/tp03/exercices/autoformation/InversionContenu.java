package fr.tp03.exercices.autoformation;

import java.util.Arrays;
import java.util.Collections;

public class InversionContenu {
	
	
	/** Reverse an array
	 * @param myArray
	 */
	static void reverse(Integer myArray[]) {
		Collections.reverse(Arrays.asList(myArray)); 
        System.out.println("Reversed Array: " + Arrays.asList(myArray));
	}
	
	public static void main(String[] args) {
		//------------------------------------------------------------------------------
		// 2.EXERCISE CONTENT INVERSION
		//------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		System.out.println("2.Exercise Content Inversion");
		System.out.println("---------------------------------------------------------");
		Integer[] array2 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		System.out.println("Original Array: " + Arrays.asList(array2));
		reverse(array2); // static method create before method main
	}
}
