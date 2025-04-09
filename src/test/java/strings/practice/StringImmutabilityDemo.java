package strings.practice;

public class StringImmutabilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * One more interesting thing about String objects in java is that they are
		 * immutable. That means once you create a string object, you can’t modify the contents of that object.
		 *  If you try to modify the contents of string object,a new string object is created with modified content.
		 */

		String s1 = "JAVA";

		String s2 = "JAVA";

		System.out.println(s1 == s2); // Output : true

		s1 = s1 + "J2EE";

		System.out.println(s1 == s2);
		System.out.println(s1); 
		System.out.println(s2); 
		
		 /* is new String() also immutable? After seeing the above example, one more question may left in your mind.
				 *    Are string objects created using new operator also immutable? 
				 *    The answer is Yes. String objects created using new operator are also immutable
				 * although they are stored in the heap memory. This can be also proved with help of an example.
				*/
		
		  String s3 = new String("JAVA");
		  
	        System.out.println(s3);         //Output : JAVA
	 
	        s3.concat("J2EE");
	 
	        System.out.println(s3);         //Output : JAVA
	    

	}

}
