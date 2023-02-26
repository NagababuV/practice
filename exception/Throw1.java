package exception;

public class Throw1 {
	public static void checkNum(int num) {
		if(num<1) {
			throw new ArithmeticException("/nNumber is negative, cannot calculate");
		}else {
			
			System.out.println("Squre of  " +num +" is "+(num*num));
		}
	}
	
	public static void main(String args[]) {
		
		Throw1 t = new Throw1();
		t.checkNum(-1);
		System.out.println("Rest of the code");
	}

}
