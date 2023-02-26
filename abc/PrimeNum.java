package abc;

public class PrimeNum {

	
	public static void isPrime(int s) {
		
		boolean isPrimee =true;
		
		for(int i=2 ; i<s ;i++) {
			
			if(s%i==0) {
				isPrimee=false;
				
			}
		}
		
	
		if(isPrimee) {
			System.out.println("Prime Number");
			
			
		}else {
			
			System.out.println("Not a prime");
		}
		
		

		
	}
	
	public static void main(String[] args) {
		
		
		isPrime(27);
		
		
	}
	
	
}
