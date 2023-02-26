package exception;

import java.io.IOException;

public class Throw {
	
	public static void check() throws IOException {
		
		
			throw new IOException("/n Not eligible::");
		
	}
	
	public static void main(String args[])  {
		
		try {
			check();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("catch");
			
			
		}
		
	
	
	}
		
	}

