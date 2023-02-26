package java8features2;

public interface Test {
	
	default void test() {
		System.out.println("from test interface default method");
	}
	
	void test1();

}
