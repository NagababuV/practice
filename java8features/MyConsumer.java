package java8features;

import java.util.function.Consumer;

public class MyConsumer  implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		
		System.out.println("Consumer impl Value::"+t);
	
		
	}
	
	

}
