package java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Foreach {
	
	public static void main(String args[]) {
		
		List<Integer> myList = new ArrayList<Integer>();
		
		for(int i =0; i<=10;i++) myList.add(i);
		
		Iterator<Integer> it = myList.iterator();
		
		while(it.hasNext()) {
			
			Integer i = it.next();
			System.out.println("Iterator"+i);
			
			
		}
		myList.forEach(new Consumer<Integer>() {
			
		

			@Override
			public void accept(Integer t) {
				System.out.println("For each"+t);
				
			}
			
			
		});
		
		
		MyConsumer action = new MyConsumer();
		
		myList.forEach(action);
		
	}

}
