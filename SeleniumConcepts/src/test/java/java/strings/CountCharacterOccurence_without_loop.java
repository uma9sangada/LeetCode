package java.strings;

public class CountCharacterOccurence_without_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String inputString = "Java is ja#a again java again";
		 
	        char h = '#';
	// System.out.println(s.length());
	        int count = inputString.length() - inputString.replace("#", "").length();
	 
	        System.out.println("Number of occurances of '"+h+"' in "+inputString+" = "+count);
	
	
	//
	 int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0, otherCount = 0;

     for (char c : inputString.toCharArray()) {
         if (Character.isUpperCase(c)) {
             uppercaseCount++;
         } else if (Character.isLowerCase(c)) {
             lowercaseCount++;
         } else if (Character.isDigit(c)){
             digitCount++;
         } else{
             otherCount++;
         }
     }

     int totalChars = inputString.length();
     double uppercasePercentage = (double) uppercaseCount / totalChars * 100;
     double lowercasePercentage = (double) lowercaseCount / totalChars * 100;
     double digitPercentage = (double) digitCount / totalChars * 100;
     double otherPercentage = (double) otherCount / totalChars * 100;
     
     
     System.out.println("Uppercase letters: " + uppercasePercentage + "%");
    		        System.out.println("Lowercase letters: " + lowercasePercentage + "%");
    		        System.out.println("Digits: " + digitPercentage + "%");
    		        System.out.println("Other characters: " + otherPercentage + "%");
    		    }
	

}
