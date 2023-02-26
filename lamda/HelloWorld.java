package lamda;

public class HelloWorld {
	public static void main(String[] args) {
		HelloInr i = (String s)->System.out.println(s);
		i.printHello("Hello World");
		
	}

}
