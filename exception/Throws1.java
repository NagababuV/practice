package exception;

public class Throws1 {
	public int  div(int a , int b) throws ArithmeticException {
		int div =a/b;
		return div;
	}
	public static void main(String[] args) {
		Throws1 t = new Throws1();
		try{
		 System.out.println(t.div(15, 5));
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			
		}
	}

}
