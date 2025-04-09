package arrays.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NthLargestAndSmallestElement {
	
	 public static int findNthLargest(int[] arr, int n) {
	        if (arr == null || arr.length < n || n <= 0) {
	            return Integer.MIN_VALUE; // Or throw an exception
	        }

	        Arrays.sort(arr);
	        return arr[arr.length - n];
	    }

	    public static int findNthSmallest(int[] arr, int n) {
	        if (arr == null || arr.length < n || n <= 0) {
	            return Integer.MAX_VALUE; // Or throw an exception
	        }

	        Arrays.sort(arr);
	        return arr[n - 1];
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 3, 5, 7, 19, 1, 15};
	        int n = 2;

	        System.out.println(n + "th largest: " + findNthLargest(arr, n)); // Output: 15
	        System.out.println(n + "th smallest: " + findNthSmallest(arr, n)); // Output: 5

	        int[] arr2 = {10,10,10,10,10};
	        System.out.println(n + "th largest arr2: " + findNthLargest(arr2,n)); //Output: 10
	        System.out.println(n + "th smallest arr2: " + findNthSmallest(arr2,n)); //Output: 10
	    }
}
