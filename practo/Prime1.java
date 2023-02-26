package practo;

import java.util.Scanner;

public class Prime1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		boolean isPrime = true;
		
		for(int i=2; i<a;i++) {
			if(a%i==0) {
				
				isPrime = false;
				
			}
		}
		
		
		if(isPrime) {
			
			System.out.println("Prime");
		}
		else {
			
			System.out.println("Not a prime");
		}
		
		
	}

}
