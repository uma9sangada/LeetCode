package java.arrays;
import java.util.Arrays;

public class Sort_An_Array {

	public static void main(String[] args) {
		 int[] arr1= {5, 2, 8, 1, 3};

	        // Sort the array in ascending order
	        Arrays.sort(arr1);

	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(arr1));
	        //without inbuilt functions
	        int[] arr= {5, 2, 8, 1, 3};
	        int n = arr.length; 
	        for (int i = 0; i < n - 1; i++) {
	            // Iterate through the unsorted part of the array
	            for (int j = 0; j < n - i - 1; j++) {
	                // Swap elements if they are in the wrong order
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    }
	            }
	        }

	        System.out.println("Sorted array: " + Arrays.toString(arr));

	}}
