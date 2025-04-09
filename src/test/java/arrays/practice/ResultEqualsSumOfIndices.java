package arrays.practice;

import java.util.HashMap;
import java.util.Map;

public class ResultEqualsSumOfIndices {

	public static void main(String[] args) {
        int[] a = {-10, 4, 5, 6, 20, 5};
        int result = 10;
        sumOfIndices(a, result);
    }

    public static void sumOfIndices(int[] arr, int result) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int complement = result - arr[i];
            if (map.containsKey(complement)) {
                System.out.println(arr[map.get(complement)] + " + " + arr[i] + " = " + result);
                found = true;
            }
            map.put(arr[i], i);
        }

        if (!found) {
            System.out.println("No pairs found that sum to " + result);
        }
    }

}
