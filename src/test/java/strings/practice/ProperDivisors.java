package strings.practice;


public class ProperDivisors {
	 public static void main(String[] args) {
	        for (int i = 2; i < 1000; i++) {
	            int sumOfAllDivisors = 0;
	            for (int j = 1; j <i; j++) { // Iterate up to i to include the number itself
	                if (i % j == 0) {
	                    sumOfAllDivisors += j;
	                }
	            }
	            if (sumOfAllDivisors == i) {
	                System.out.println("Sum of all divisors equals the number: " + i);
	            }
	        }
	    }
}