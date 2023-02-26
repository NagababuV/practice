package multithreading;

public class multithreading {

	public static void main(String[] args) {

		Hello h = new Hello();
		Hi i = new Hi();

		h.start();
		try {
			
			Thread.sleep(10);
		}catch(Exception e) {
			
		}
		i.start();
	

	}

}
