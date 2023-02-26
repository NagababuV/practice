package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotCheckedCompile2 {
	public static void main(String args[])  {
		FileNotCheckedCompile2 e = new FileNotCheckedCompile2();
		try {
			e.read("hello.txt");
		} catch (FileNotFoundException e1) {
			
		 System.out.println(e1.getMessage());
		}
		
	
	}
		public void read(String f) throws FileNotFoundException{
			
			FileInputStream fis = new FileInputStream(f);
			Scanner sc = new Scanner(fis);
			System.out.println(sc.nextLine());
			sc.close();
			
			
		}
	
		
	

}
