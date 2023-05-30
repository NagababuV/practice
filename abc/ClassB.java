package abc;
public class ClassB extends classA{
	
//	@Override
	public void test(long a) {
		System.out.println("In class B ");
		
	}
	
	public static void main(String args[]) {
		
		ClassB b = new ClassB();
		b.test(200l);
		b.test(10);
		
		//hi
				
	}

}
