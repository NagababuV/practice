package abstraction1;

public abstract class Car{


	abstract void startEngine();
	abstract void startRadiator();
	
	void start(String type) {
		
		if(type.equals("E")) {
			startEngine();
			}else {
				
				startRadiator();
			}
	}
	
	
	
	
}
