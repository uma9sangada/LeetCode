package arrays.practice;

import java.util.*;

public class MinAndMaxDifference {
	
	

	    public static int findMinAbsoluteDifference(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            return Integer.MAX_VALUE;
	        }

	        Arrays.sort(arr);

	        int minDifference = Integer.MAX_VALUE;

	        for (int i = 1; i < arr.length; i++) {
	            int difference = Math.abs(arr[i] - arr[i - 1]);
	            minDifference = Math.min(minDifference, difference);
	        }

	        return minDifference;
	    }

	    public static int findMaxAbsoluteDifference(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            return Integer.MIN_VALUE;
	        }

	        Arrays.sort(arr);

	        return Math.abs(arr[arr.length - 1] - arr[0]);
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {3, 8, 10, 15};
	        int[] arr2 = {1, 5, 3, 19, 18, 25};
	        int[] arr3 = {10, 2, 5, 8};
	        int[] arr4 = {1};
	        int[] arr5 = {};

	        System.out.println("Min absolute difference for arr1: " + findMinAbsoluteDifference(arr1));
	        System.out.println("Max absolute difference for arr1: " + findMaxAbsoluteDifference(arr1));

	        System.out.println("Min absolute difference for arr2: " + findMinAbsoluteDifference(arr2));
	        System.out.println("Max absolute difference for arr2: " + findMaxAbsoluteDifference(arr2));

	        System.out.println("Min absolute difference for arr3: " + findMinAbsoluteDifference(arr3));
	        System.out.println("Max absolute difference for arr3: " + findMaxAbsoluteDifference(arr3));

	        System.out.println("Min absolute difference for arr4: " + findMinAbsoluteDifference(arr4));
	        System.out.println("Max absolute difference for arr4: " + findMaxAbsoluteDifference(arr4));

	        System.out.println("Min absolute difference for arr5: " + findMinAbsoluteDifference(arr5));
	        System.out.println("Max absolute difference for arr5: " + findMaxAbsoluteDifference(arr5));
	    }
	}


