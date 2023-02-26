package exception;

import java.io.IOException;

public class TestThrow {
	
	public static void method1() throws IOException {
		
		throw new IOException("file not found");
	}

	public static void main(String[] args) {
		
		try {
			method1();
		}catch(Exception e ) {
			System.out.println(e.getMessage());
			System.out.println("catch");
				
		}
	
	}

}
