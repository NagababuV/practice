package defaultMethodsAndMultipleInheritance;

public class Main implements Test1, Test2 {

	@Override
	public void foo() {
		System.out.println("This is from manin class");
	}
	
	
	public static void main(String[] args) {
		
		
		Main m = new Main();
		
		m.foo();
		
	}

}
