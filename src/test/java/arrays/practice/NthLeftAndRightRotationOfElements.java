package arrays.practice;

public class NthLeftAndRightRotationOfElements {
	
 // Helper function to reverse a subarray
	    public static void reverseArray(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    // Left Rotation using Reversal
	    public static int[] leftRotate(int[] arr, int d) {
	        int n = arr.length;
	        d = d % n;
	        reverseArray(arr, 0, d - 1);
	        reverseArray(arr, d, n - 1);
	        reverseArray(arr, 0, n - 1);
	        return arr;
	    }

	    // Right Rotation using Reversal
	    public static int[] rightRotate(int[] arr, int d) {
	        int n = arr.length;
	        d = d % n;
	        reverseArray(arr, n - d, n - 1);
	        reverseArray(arr, 0, n - d - 1);
	        reverseArray(arr, 0, n - 1);
	        return arr;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int d = 2;

	        System.out.println("Original array: " + java.util.Arrays.toString(arr));

	        int[] leftRotatedArray = leftRotate(arr.clone(), d);
	        System.out.println("Left rotated by " + d + " (Reversal): " + java.util.Arrays.toString(leftRotatedArray));

	        int[] rightRotatedArray = rightRotate(arr.clone(), d);
	        System.out.println("Right rotated by " + d + " (Reversal): " + java.util.Arrays.toString(rightRotatedArray));
	    }
	

}
