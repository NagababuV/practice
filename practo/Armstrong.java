package practo;

public class Armstrong {
	


	public static void main(String[] args) {
		int n =153;
		int org = n;
		int r=0;
		int d=0;
		
		
		while(n>0) {
			
			r=n%10;
			
			d =+  (int)Math.pow(r, 3) + d;
		
		System.out.println(d);
			
			n=n/10;
			
			
			
			
		}
		
		if(d==org) {
			System.out.println("arms");
			
		}else {
			System.out.println("Not a arms");
		}
	}

}
