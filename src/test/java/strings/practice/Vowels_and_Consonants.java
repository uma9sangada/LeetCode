package strings.practice;
import java.util.*;

import org.testng.annotations.Test;

public class Vowels_and_Consonants {

	@Test
	public  void mock(){
		
		
		String input="uma chandra sekHar";
		isVowel(input);
	}

	public void isVowel(String input) {
		List<Character> vowels= List.of('a','e','i','o','u');
				//Arrays.asList('a','e','i','o','u');
		for(char c : input.toLowerCase().replaceAll("\\s+","").toCharArray())
		{
			if(vowels.contains(c))
			{
				System.out.println("vowels is : "+ c);
			}
			else {
				System.out.println("consonants are "+ c);
			}
		}
		
	}
	

}
