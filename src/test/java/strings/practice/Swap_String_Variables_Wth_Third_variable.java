package strings.practice;

public class Swap_String_Variables_Wth_Third_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str1 = "Hello";
        String str2 = "Wor";

        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2); 
        // Swap the strings using XOR operation
        str1 = str1 + str2;
        System.out.println(str1.length());
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("\nAfter swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);


	}

}
