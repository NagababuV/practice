package practo;

public class Pallendrome {
	
	public static void main(String[] args) {
		
		int n =121;
		
		int org =n;
		int r=0;
		int d =0;
		
		while(n>0) {
			
			r=n%10;
			d = (d*10)+r;
			System.out.println(d);
			n=n/10;
			
			
		}
		
		if(org==d) {
			
			System.out.println("Its a pallendrome");
		}
		else {
			System.out.println("not a pallendrome");
			
		}
		
		
	}
	

}
