package java8features;

//if there is single abstract method  in interface it called functional interface
@FunctionalInterface
public interface FunctionalInterface1 {
	void abstractm(int m);
	
	default void  def() {
		System.out.println("from default methode::");
	}
	static void sta() {
		System.out.println("from static method::");
	}

	}
