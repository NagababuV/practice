package java8features1;
@FunctionalInterface
 interface Test {
	
	
	static void static_m(){
		System.out.println("From static method in interface test");
		
	}
	
	void abstractMethod(String str);


}
