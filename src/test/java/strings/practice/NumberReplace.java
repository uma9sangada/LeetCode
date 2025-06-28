package strings.practice;

import java.util.*;

public class NumberReplace {

	public static void main(String[] args) {
	    String input1 = "1234";
	    String input2 = "one2three4";

	    System.out.println("Original string 1: " + input1);
	    String converted1 = replaceOddPositionsWithDigitWords(input1);
	    System.out.println("Converted string 1: " + converted1);

	    System.out.println("\nOriginal string 2: " + input2);
	    String converted2 = replaceOddPositionsWithDigitWords(input2);
	    System.out.println("Converted string 2: " + converted2);
	}

	public static String replaceOddPositionsWithDigitWords(String input) {
	    StringBuilder result = new StringBuilder();
	    String[] digitWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

	    for (int i = 0; i < input.length(); i+=2) {
	        char c = input.charAt(i);
	            if (Character.isDigit(c)) {
	                int digit = Character.getNumericValue(c);
	                result.append(digitWords[digit]);
	            } else {
	                result.append(c);
	            }
	      
	    }
	    return result.toString();
	}
}