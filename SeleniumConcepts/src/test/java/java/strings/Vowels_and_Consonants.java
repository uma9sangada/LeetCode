package java.strings;
import java.util.*;

public class Vowels_and_Consonants {

	public static void main(String[] args) {
		String 	inputString = "uMa Cf",New="";
		int vowelCount = 0;
	             int consonantCount = 0;

	             for (char ch : inputString.toLowerCase().trim().replaceAll("//s+","").toCharArray()) {
	                 if (isVowel(ch)) {
	                     vowelCount++;
	                 } else {
	                     consonantCount++;
	                 }
	             }

	             System.out.println("Vowel count: " + vowelCount);
	             System.out.println("Consonant count: " + consonantCount);
	             
	             
	             for (char ch : inputString.toCharArray()) {
	            	// System.out.println(ch);
	                 if (!changeVowel(ch)) {
	                	 {
	                		New+=ch; 
	                	 }
	                	 }
	             }
	             
	             System.out.println("without vowels: " + New);
	         }
	
	

	         public static boolean isVowel(char ch) {
	             return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	         }
	         
	         public static boolean changeVowel(char ch) {
	             return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	         }

}
