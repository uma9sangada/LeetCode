package arrays.practice;
import java.util.*;

public class Kth_Repetative_Element_In_Array {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5, 1};
        int k = 1;

        // Find Kth Repetitive Element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

//        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(frequencyMap.entrySet());
//               list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())); // Descending order
//
//               int kthRepetitive = list.get(k - 1).getKey();
//               System.out.println("Kth Repetitive: " + kthRepetitive);
//
//               // Find Kth Non-Repetitive Element
//               list.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())); // Ascending order
//
              int count = 0;
        for (int a: arr) {
            if (frequencyMap.get(a) == 2) {
                count++;
                if (count == k) {
                    System.out.println("Kth Non-Repetitive: " + a);
                    break;
                }
            }
        }

        
    }

}
