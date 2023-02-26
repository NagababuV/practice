package java8features;

public class LambdaInterImp  {


//	@Override
//	public void sum(int a, int b) {
//	
//		int c =a+b;
//		
//		System.out.println(c);
//				
//		
//	}
	// lambda is a anonymous function in java that is with out method name, return type and access modifiers
	//less code
	//easy to implement anonymous inner classes
	//easyly pass lambda expressions or parameters to other methods
	//to implement lambda expressions we use functional interface
	
	
	public static void main(String[] args) {

		
		LambdaInter L=(int a , int b ) ->  System.out.println(a+b);
		
	
		L.sum(2, 3);
		
	}



}
