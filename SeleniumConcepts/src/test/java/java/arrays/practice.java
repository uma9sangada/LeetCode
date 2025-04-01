package java.arrays;
import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] input ={1,22,3,4,5,7,44,2,3,4,8,9};

int min=input[0],max=input[0];


		for(int i=0;i<input.length-1;i++)
		{
			if(input[i]<min)
				min=input[i];
			else if(input[i]>max)
				max =input[i];
				
		}
		System.out.println(min+","+max);
	}

}
