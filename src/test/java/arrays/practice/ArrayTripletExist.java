package arrays.practice;

import java.util.*;

public class ArrayTripletExist {

    public static void findTripletsOptimized(int[] arr) {
        if (arr == null || arr.length < 3) {
            System.out.println("Input Array : " + Arrays.toString(arr));
            System.out.println("Array must have at least 3 elements.");
            return;
        }

        System.out.println("Input Array : " + Arrays.toString(arr));
        System.out.println("Array triplets with sum of first two elements equals third :");

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) {
                    System.out.println("[" + arr[left] + ", " + arr[right] + ", " + arr[i] + "]");
                    left++;
                    right--;
                } else if (arr[left] + arr[right] < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {21, 13, 47, 61, 34, 40, 55, 71, 87};
        findTripletsOptimized(arr1);
    }
}