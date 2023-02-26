package exception;

public class Arthimetic {
	
	public static void main(String args[]) {
		
		int x =9;
		int y= 0;
		
		try {
			
			int z = x/y;
			
			System.out.println(z);
		}catch(ArithmeticException e) {
			
			System.out.println("can't divide with zero");
		}
	}

}
