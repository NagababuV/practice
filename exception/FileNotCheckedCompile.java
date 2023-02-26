package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotCheckedCompile {
	public static void main(String args[]) {
		
	
	
			try {
				FileInputStream fis = new FileInputStream("greet3.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			}
	
			
			
			int a =5 ;
			int b =0;
			int c =a/b;
		
	}

}
