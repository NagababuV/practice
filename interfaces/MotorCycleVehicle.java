package interfaces;

public class MotorCycleVehicle implements Engine {
	
	int speed;
	int gear;

	@Override
	public void changeGear(int a) {
		
		this.gear=a;
		
		System.out.println("Gear :"+a);
	}

	@Override
	public void speedUp(int b) {
		
		this.speed=b;
		System.out.println("Speed :"+b);
		
		
	}
	public static void main(String args[]) {
		
		MotorCycleVehicle m = new MotorCycleVehicle();
		m.changeGear(7);
		m.speedUp(33);
	}

}
