package java8featues3;

import java.util.function.Function;
import java.util.function.Predicate;

public class Predicatee {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i->i>10;//take single argument and gives boolean value as a result
		
	System.out.println(	p.test(3));
	
	Predicate<Integer> s = d ->d<10;
	
	
	
	System.out.println(s.test(3));
	
	System.out.println(p.and(s));
	
		
	System.out.println(p.or(s));
	
	//System.out.println(p.negate(),s);
	
	Function<String,Integer> f = i->i.length(); 
	System.out.println(f.apply("America"));
	
	}
}
