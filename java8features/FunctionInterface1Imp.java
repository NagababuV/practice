package java8features;



public class FunctionInterface1Imp  implements FunctionalInterface1{

	@Override
	public void abstractm(int m) {
	
		System.out.println("from abstract method");
		


		
	}
	
	public static void main(String[] args) {
		FunctionInterface1Imp i = new FunctionInterface1Imp();
		
		i.abstractm(3);
		i.def();// default method is called by class reference
		FunctionalInterface1.sta();//static method is called by interface reference
		
	}
	
	
	
	
	

}
