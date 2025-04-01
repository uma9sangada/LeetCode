package java.arrays;
import java.util.Arrays;

public class Largest_Element_In_Array {

	public static void main(String[] args) {
		 int[] arr = {5, 2, 8, 1, 9};
		
	        int[] minMax = findMinMax(arr);
	        System.out.println("Minimum: " + minMax[0]);
	        System.out.println("Maximum: " + minMax[1]);
	}
	
	public static int[] findMinMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr[0],max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }
	
	
	

}
