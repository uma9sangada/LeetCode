package arrays.practice;
import java.util.*;

public class DuplicateFinder {
    public static void findDuplicates(int[] arr) {
       Set<Integer> seen = new LinkedHashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println("Duplicate found: " + num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 2};
        findDuplicates(arr);
    }
}