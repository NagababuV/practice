package java8featues3;

import java.util.function.Predicate;

public class Predicat1 {
	 public static void main(String[] args) {
		
		 int[] a = {1,2,3,5,6,7,4,4,7,3,11,16,17,18};
		 
		 
		 
		 Predicate<Integer> p = r -> r>10;
		 Predicate<Integer> q = u -> u%2==0;
		 
		 System.out.println("Greater than 10 and even numbers");
		 dummy(p.and(q),a);
		 System.out.println("Greater than 10 and even numbes");
		 dummy(p.or(q),a);
		 System.out.println("Not greater than 10 ");
		 dummy(p.negate(),a);
	
		 
		 
	 }
		 
		public static void dummy(Predicate<Integer> p ,int[] a){
			 
			for(int a1:a) {
				if(p.test(a1)) {
					System.out.println(a1);
				}
				
			}
			
		 
		
		 
		 
	}

}
