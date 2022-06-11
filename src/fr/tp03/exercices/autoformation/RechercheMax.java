package fr.tp03.exercices.autoformation;

public class RechercheMax {

	public static void main(String[] args) {
		//------------------------------------------------------------------------------
		// 3.MAX RESEARCH EXERCISE
		//------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		System.out.println("3.MAX RESEARCH EXERCISE");
		System.out.println("---------------------------------------------------------");
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	    int maxNum = array[0];
	    for (int num : array) {
	       if (num > maxNum)
	        maxNum = num;
	    }
	    System.out.println("Maximum number = " + maxNum);

	}

}
