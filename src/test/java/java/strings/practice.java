package java.strings;
import java.util.Arrays;
import java.util.Collections;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,a=90,b=65;
		
		for(int i=0; i<=n;i++)
		{
			for(int u=n;u>i;u--)
			{
				System.out.print(" ");
			}
				
				for(int j=0;j<=i;j++)
				{
					System.out.print((char)(b+i)+" ");
				}
				System.out.println();
		}
		
		for(int i=0; i<=n;i++)
		{
			for(int u=0;u<i;u++)
			{
				System.out.print(" ");
			}
				
				for(int j=n;j>=i;j--)
				{
					System.out.print((char)(b+i)+" ");
				}
				System.out.println();
		}
		
		for(int i=0; i<=n;i++)
		{
			for(int u=0;u<i;u++)
			{
				System.out.print(" ");
			}
				
				for(int j=n;j>=i;j--)
				{
					System.out.print((char)(b+i)+" ");
				}
				System.out.println();
				
		}
		
		int[] a1 = {10,20,233,32,1};
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		System.out.println(a1.length);
		System.out.println(a1[a1.length-1]);
		Integer[] k= {1,2,3,4,5};
		Collections.reverse(Arrays.asList(k));
		System.out.println(Arrays.toString(k));
		
			

	}

}
