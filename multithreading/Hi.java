package multithreading;

public class Hi extends Thread{

	public void run() {

		for (int i = 0; i <= 4; i++) {

			System.out.println("HI");
			try {

				Thread.sleep(1000);

			}

			catch (Exception e) {
			}

		}

	}

}