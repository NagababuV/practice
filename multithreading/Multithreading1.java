package multithreading;

public class Multithreading1 {
	public static void main(String args[]) {

		Thread t1 = new Thread(() -> {
			System.out.println("from t1");


			for (int i = 0; i <= 5; i++) {

				System.out.println("Hi");
			
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}

		});

		Thread t2 = new Thread(() -> {
			System.out.println("from t2");
			for (int i = 0; i <= 5; i++) {

				System.out.println("Hello");
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}

			}

		});

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {

		}
		t2.start();

	}
}
