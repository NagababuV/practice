package abstraction1;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Ford f = new Ford();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : ");
		
		String s = sc.nextLine();
		
		f.start(s);
	}

}
