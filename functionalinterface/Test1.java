package functionalinterface;

@FunctionalInterface
public interface Test1 {
	void fooi(String msg);
	
	int hashCode();
	String toString();
	boolean equals(Object obj);

}


////declare a functional interface 
//@FunctionalInterface        //annotation indicates it’s a functional interface
//interface function_Interface{  
//  void disp_msg(String msg);   // abstract method  
//  // Object class methods.  
//  int hashCode();  
//  String toString();  
//  boolean equals(Object obj);  
//} 