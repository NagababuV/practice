package lambda1;

import java.util.ArrayList;

public interface Lam2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		a.forEach( (n) ->{System.out.println(n);});
	}
}
