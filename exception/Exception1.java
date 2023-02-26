package exception;

public class Exception1 {
	public static void main(String args[]) {
		try {
			
			int i = 50/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
			
			
		}
		
		System.out.println("run the remaining");
		
		
	}

}
