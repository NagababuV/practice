package exception;

import java.io.IOException;

public class Throws {
	
	public static int checkNum(int m,int n) throws ArithmeticException{
		
		int div=m/n;
		
		return div;
	}
	
	public static void main(String args[]) {
		Throws t = new Throws();
	
		try {
			
			System.out.println(t.checkNum(25, 5));
		}catch(ArithmeticException e){
			System.out.println("\nNumber cannot be divided by 0");
			
			
			
		}
		
		System.out.println("Rest of the code");
		
		
	}

}
