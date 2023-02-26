
package exception;

import java.util.Scanner;

public class p1 {
	
	public static void main(String args[]) {
		
		System.out.println("Enter a number");
		
		
		Scanner sc = new Scanner(System.in);
		
		int i =9;
		
		int r;
		
		int d = sc.nextInt();
		
		System.out.println("Program starts here");
		
		try {
			r = 9/d;
			System.out.println(r);
			
		}catch(ArithmeticException e) {
			
			System.out.println("cant divide with 0");
			throw e;
			
		}
		
	
		finally {
			
			System.out.println("Finally  block");
		}

	
		System.out.println("Program ends here");
		
	}
	
	
	
	
	}


