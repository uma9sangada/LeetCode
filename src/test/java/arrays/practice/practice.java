package arrays.practice;

import java.util.*;

public class practice {
	
	
	public static void main(String[] args) {
	
		 String p="this ij this",s="";
		    HashSet<String> set = new HashSet();
		    
		    for(String v : p.split(" ")) 
		    {
		        
		        if(! set.add(v) )  s=p.replaceAll(v,new StringBuilder(v).reverse().toString());
		         System.out.println(s);
		    }}
	
}