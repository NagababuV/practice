package lamda;

public class l1 {
	public static void main(String args[]) {
		
		new Thread(()-> System.out.println("Printing from the runnable")).start();
		
		
		
	}
	}
//		new Thread(new Runnable(){
//			
//		@Override
//		public void run() {
//			System.out.println("Printing from the runnable");
//			
//			
//		}
//		
//		
//		}).start();
//			
//		
//			
//			
//		
//		
//		
//	}
//
//}

class CodeToRun implements Runnable{

	@Override
	public void run() {
		System.out.println("Printing from the runnable");
		
	}}
