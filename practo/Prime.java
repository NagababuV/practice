package practo;

public class Prime {
	
	public static void main(String[] args) {
		
		int n =4;
		
		boolean isPrime=true;
		
		for(int i=2; i<n;i++) {
			
			if(n%i==0) {
				
				isPrime = false;
			}
			
			
		}
		
		if(isPrime) {
			
			System.out.println("Its prime number");
		}else {
			
			System.out.println("Not a prime");
		}
	}

}
