package fr.tp03.exercices.autoformation;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		//------------------------------------------
		// 1-EXERCISE REVERSE DISPLAY
		//------------------------------------------
		
		// Declaration of an array
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// 1.1-Display all elements of the array using a loop
		System.out.println("---------------------------------------------------------");
		System.out.println("1-exercise Reverse display");
		System.out.println("1.1-Display all elements of the array using a loop :");
		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// 1.2-Display all elements in reverse order of the array
		System.out.println("---------------------------------------------------------");
		System.out.println("1.2-Display all elements in reverse order of the array");
		System.out.println("---------------------------------------------------------");
		System.out.println("Array before inversion: " + Arrays.toString(array));
		for (int i = 0; i < array.length/2; i++) {
			int tmp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = tmp;
		}	
		System.out.println("Array after inversion: " + Arrays.toString(array));
		
		// 1.3-Create an arrayCopy array and copy all elements of array into arrayCopy
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("1.3-Create an arrayCopy array and copy all elements of array into arrayCopy");
		System.out.println("---------------------------------------------------------------------------");
		int[] arrayCopy = Arrays.copyOf(array, array.length);
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println("arrayCopy | index: " + i + " - content: " + arrayCopy[i]);
		}
		
	}

}
