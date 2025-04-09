package strings.practice;

public class String_Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// without preserving the spaces
		String s = "uma chan dra", c = "";

		reverseString("I Am Not String");
		reverseString("JAVA JSP ANDROID");
		
		String_Reversal a = new String_Reversal();
		a.reverseEachWord(s);
		
		//reverseString("1 22 333 4444 55555");
		System.out.println(s.length());

		for (int i = s.length() - 1; i >= 0; i--) {
			c += s.charAt(i);

		}
		StringBuilder b = new StringBuilder(s);
		b.reverse();
		System.out.println(c);
		System.out.println(b.toString());
	}

	// with preserving space
	public static void reverseString(String inputString) {
		char[] charArray = inputString.toCharArray();
		int left = 0, right = charArray.length - 1;

		while (left < right) {
			// Skip spaces from left
			while (left < right && charArray[left] == ' ') {
				left++;
			}

			// Skip spaces from right
			while (left < right && charArray[right] == ' ') {
				right--;
			}

			// Swap non-space characters
			if (left < right) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
		}

		System.out.println(inputString + " ---> " + String.valueOf(charArray));
	}
	
	//reverse each word
	
	public  void reverseEachWord(String inputString)
	{
		
		String[] words = inputString.split(" ");
        
        String reverseString = "";
		
		 for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	             
	            reverseString +=reverseWord + " ";
	        }
	         
	        System.out.println(inputString);
	         
	        System.out.println(reverseString);
	         
		
		
		
	}

}
