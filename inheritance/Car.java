package inheritance;

public class Car extends Vehicle {
	
	private String carName;
	private String fuelType;
	

	public Car(String color, int wheelNo, int engineCount, String carName, String fuelType) {
		super(color, wheelNo, engineCount);
		// TODO Auto-generated constructor stub
		this.fuelType=fuelType;
		this.carName=carName;
	}


	@Override
	public void handSteering() {
		// TODO Auto-generated method stub
		super.handSteering();
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}


	@Override
	public void changeGears() {
		// TODO Auto-generated method stub
		super.changeGears();
	}
	
	

}
