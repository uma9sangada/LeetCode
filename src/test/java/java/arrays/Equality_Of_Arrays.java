package java.arrays;
import java.util.Arrays;

public class Equality_Of_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 0, 1};
        if (areArraysEqual(array1, array2)) {
            System.out.println("Arrays array1 and array2 are equal.");
        } else {
            System.out.println("Arrays array1 and array2 are not equal.");
        }

	}
	 public static boolean areArraysEqual(int[] arr1, int[] arr2) {
	        // Check if the lengths of the arrays are equal
	        if (arr1.length != arr2.length) {
	            return false;
	        }

	        // Sort both arrays to ensure elements are compared in the same order
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Compare the sorted arrays element by element
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) {
	                return false;
	            }
	        }

	        // If no differences found, the arrays are equal
	        return true;
	    }

}
