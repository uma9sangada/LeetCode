package arrays.practice;

import java.util.*;

public class DuplicateRemover {

	
	public static int[] removeDuplicatesUsingSet(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; // Handle null or empty arrays
        }

        Set<Integer> set = new LinkedHashSet<>(); // Use LinkedHashSet to preserve order
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4, 5};
        int[] arr2 = {1, 1, 1, 1, 1};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {};
        int[] arr5 = null;

        System.out.println("Array 1 (Set): " + Arrays.toString(removeDuplicatesUsingSet(arr1))); // [1, 2, 3, 4, 5]
        System.out.println("Array 2 (Set): " + Arrays.toString(removeDuplicatesUsingSet(arr2))); // [1]
        System.out.println("Array 3 (Set): " + Arrays.toString(removeDuplicatesUsingSet(arr3))); // [1, 2, 3, 4, 5]
        System.out.println("Array 4 (Set): " + Arrays.toString(removeDuplicatesUsingSet(arr4))); // []
        System.out.println("Array 5 (Set): " + Arrays.toString(removeDuplicatesUsingSet(arr5))); // []

        }
}
