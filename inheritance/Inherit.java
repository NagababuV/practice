package inheritance;

public class Inherit{
	public static void main(String args[]) {
		
		Car c = new Car("Black", 5, 4,"BenZ","petrol");
		
		System.out.println(c.getColor());
		System.out.println(c.getWheelNo());
		System.out.println(c.getEngineCount());
		c.changeGears();
	
	}

}
