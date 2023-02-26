package covariant;

public class Covariant1  extends Covariant{
	@Override
	Covariant1 get() {
		return this;
	}
	
	void message() {
		System.out.println("Welcome to covariant return type");
	}

	public static void main(String args[]) {
		new Covariant1().get().message();
	}
}
