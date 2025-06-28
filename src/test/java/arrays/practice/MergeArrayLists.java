package arrays.practice;

import java.util.*;

public class MergeArrayLists {
	
	public static void main(String[] args) {
		List<Object> l=new ArrayList<>();
//		l.addAll(List.of(1,2,3));
//		l.addAll(List.of('a','b','c','d'));
		
		List<Integer> n= Arrays.asList(1,2,3);
		List<Character> c= Arrays.asList('a','b','c','d');
		int i=0,j=0;
		while(i<n.size() || j<c.size()) {
			if (i < n.size()) {
                l.add(n.get(i));
                i++;
            }
            if (j < c.size()) {
                l.add(c.get(j));
                j++;
            }
        }
		
		System.out.println(l);
	}}
	
	 
//    int[] a={1,7,3,3,2,7};
//    int[] b={17,327};
//   int[] mer= new int[a.length+b.length];
//   
//   for(int i =0;i<a.length;i++)
//   {
//       mer[i] = a[i];
//   }
//   
//    for(int j =0;j<b.length;j++)
//   {
//       mer[a.length+j] = b[j];
//   }
//   
//   System.out.println(Arrays.toString(mer));
 



