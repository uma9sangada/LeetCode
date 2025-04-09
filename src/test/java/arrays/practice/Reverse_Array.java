package arrays.practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using built in functions
		  Integer[] arr1 = {1, 2, 3, 4, 5};

	        // Reverse the array using Collections.reverse()
	        Collections.reverse(Arrays.asList(arr1));

	        // Print the reversed array
	        System.out.println("Reversed array: " + Arrays.toString(arr1));
	    
// without built in functions
	        int[] arr = {1, 2, 3, 4, 5,6};

	        reverseArray(arr);

	        System.out.println("Reversed array: " + Arrays.toString(arr));
	    }

	    public static void reverseArray(int[] arr) {
	        int n = arr.length;

	        // Iterate through half the array
	        for (int i = 0; i < n / 2; i++) {
	            // Swap elements at indices i and n-i-1
	            int temp = arr[i];
	            arr[i] = arr[n - i - 1];
	            arr[n - i - 1] = temp;
	        }
	}
	
	

}
