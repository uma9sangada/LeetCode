package strings.practice;

public class String_Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		///////////////////////////////////////////////////////////
		
		for (int i = 1; i <= n; i++) {
			for(int u=n-1;u>=i;u--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();

		}
		///////////////////////////////////////////
		
		for (int i = 1; i <= n; i++) {
			

			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
		//////////////////////
		
for (int i = 1; i <= n; i++) {
	for(int u=1;u<i;u++) {
		System.out.print(" ");
	}

			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
		
		for (int i = 1; i <= n; i++) {
			for(int u=n;u>i;u--) {
				System.out.print(" ");
			}

					for (int j = 1; j <= i; j++) {
						System.out.print("* ");
					}
					System.out.println();

				}
		
		for (int i = 1; i <= n; i++) {
			for(int u=1;u<i;u++) {
				System.out.print(" ");
			}

					for (int j = n; j >= i; j--) {
						System.out.print("* ");
					}
					System.out.println();

				}
		
		int a=65;
		for (int i = 1; i <= n; i++) {
			for(int u=n;u>i;u--) {
				System.out.print(" ");
			}

					for (int j = 1; j <= i; j++) {
						System.out.print((char) (a+j)+" ");
					}
					System.out.println();

				}
		
		for (int i = 1; i <= n; i++) {
			for(int u=1;u<i;u++) {
				System.out.print(" ");
			}

					for (int j = 0; j <= n-i; j++) {
						System.out.print((char) (a+j)+" ");
					}
					System.out.println();

				}
		
		int b=90;
		for (int i = 1; i <= n; i++) {
			for(int u=n;u>i;u--) {
				System.out.print(" ");
			}

					for (int j = 1; j <= i; j++) {
						System.out.print((char) (b-i)+" ");
					}
					System.out.println();

				}
		
		int z=90,n1=5;
		for(int i=1;i<=n1;i++) { 
			for(int l=n1;l>i;l--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i-1;j++) { 
			System.out.print((char)(z-j)+" ");
		}
			System.out.println();}

	}
		
		
		
		

	
	
	
	

}
