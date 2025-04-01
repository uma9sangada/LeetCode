package java.arrays;
import java.util.HashSet;

public class DuplicateFinder {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
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