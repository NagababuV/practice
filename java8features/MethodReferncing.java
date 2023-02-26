package java8features;

public class MethodReferncing implements Runnable {
	

	//functional interface also introduced methodreferencing which can map both methods and constructor to
	
	//functional interface
	
	
	//The Runnable interface should be implemented by any class whose instances
	//are intended to be executed by a thread. The class must define a method of no arguments called run.
	
	public static void main(String[] args) {
		
	Runnable r = MethodReferncing :: new;
		
	//	Runnable r = new MethodReferencing1();
	//	Runnable s = new MethodReferncing();
		
		Thread t = new Thread(r);
	//	Thread m = new Thread(s);
		
		
		
		t.start();
	//	m.start();
	}



	private String name;
	
	public MethodReferncing() {
	
		
	}
	
static void dummy(){
		
	
		System.out.println("from dummy");
	}



@Override
public void run() {
	System.out.println(" from run same class");
	
}

}
