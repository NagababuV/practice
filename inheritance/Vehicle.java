package inheritance;

public class Vehicle {
	
	private String color;
	private int wheelNo;
	private int engineCount;

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Vehicle(String color, int wheelNo, int engineCount) {
		super();
		this.color = color;
		this.wheelNo = wheelNo;
		this.engineCount = engineCount;
	}
	public int getWheelNo() {
		return wheelNo;
	}
	public void setWheelNo(int wheelNo) {
		this.wheelNo = wheelNo;
	}
	public int getEngineCount() {
		return engineCount;
	}
	public void setEngineCount(int engineCount) {
		this.engineCount = engineCount;
	}
	public void handSteering() {
		
	}
	public void move() {
		
	}
	public void changeGears() {
		
	}
	
	
	

}
