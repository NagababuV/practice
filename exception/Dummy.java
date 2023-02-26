package exception;

import java.util.Scanner;

public class Dummy {
	
	//checked exceptions - compile time
	//-> prdictable failure checked before execution
	// 1)FileNotFoundExcetion 2) NetworkException 3) IOException 4) SQLException
	
	// Unchecked Exceptions - runtime 
	//->occurs at runtime and not checked by the compiler
	// 1)ArrayIndexOutOfBoundException
//	   2)NullPointerException
//     3)InputMismatchException
//     4)IllegalArgumentException
	
	public static int checkNum(int a , int b) {
	
		int div =a/b;
		return div;
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		Dummy d = new Dummy();
		System.out.println(d.checkNum(25, 0));
	

		
	}

}
