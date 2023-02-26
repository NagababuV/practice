package java8features1;

public class StaticAndAbstract  implements Test{

	@Override
	public void abstractMethod(String str) {
		
		System.out.println(str);
		
		
	}
	
	public static void main(String[] args) {
		
		StaticAndAbstract n = new StaticAndAbstract();
		
		n.abstractMethod("From abstract");
		
		Test.static_m();
		
	}

}
