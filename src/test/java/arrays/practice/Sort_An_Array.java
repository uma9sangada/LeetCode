package arrays.practice;
import java.util.Arrays;

public class Sort_An_Array {

	public static void main(String[] args) {
		 int[] arr1= {5, 2, 8, 1, 3};

	        // Sort the array in ascending order
	        Arrays.sort(arr1);

	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(arr1));
	        //without inbuilt functions
	        int[] a= {5, 2, 8, 1, 3};
	        for(int i=0;i<a.length;i++)
	   	 {
	   	    for(int j=i+1;j<a.length;j++)
	   	    {
	   	        if(a[i]>a[j])
	   	        {
	   	           int temp=a[i];
	   	           a[i]=a[j];
	   	           a[j]=temp;
	   	        }
	   	    }
	   	 }

	        System.out.println("Sorted array: " + Arrays.toString(a));

	}
	}
