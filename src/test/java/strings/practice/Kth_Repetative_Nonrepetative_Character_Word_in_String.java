package strings.practice;

import java.util.*;

public class Kth_Repetative_Nonrepetative_Character_Word_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="umaChandraSekhar Sangada";
		int count =0;
		StringBuilder d = new StringBuilder();
		
		
		Map<Character,Integer> charCount = new HashMap<>();
		Map<String,Integer> wordCount = new HashMap<>();
		
		
		//List<Integer> duplicates= new ArrayList<>();
		//for characters
		for(char c : s.toLowerCase().trim().replaceAll("//s+","").toCharArray()) {
		
			charCount.put(c, charCount.getOrDefault(c,0)+1);
		}
		
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			
			if(entry.getValue()>=1) {
		    System.out.print(entry.getKey() + "-" + entry.getValue() + "times ");}
			
		
		}
		System.out.println();
		
		
		//for words
		for(String words : s.toLowerCase().trim().split("\\s+"))
		{
			wordCount.put(words, wordCount.getOrDefault(words,0)+1);
		}
		
       for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			
			
		    System.out.print(entry.getKey() + "-" + entry.getValue() + "times ");
		
		}
		
	
		
		
		
		
		for(char c : s.toLowerCase().trim().replaceAll("//s+","").toCharArray())
		{
			if(charCount.get(c)==7)
			{
				
				count++;
				if(count==7)
				{
					System.out.println(c);
				}
			}
		}
		
		

	}

}
