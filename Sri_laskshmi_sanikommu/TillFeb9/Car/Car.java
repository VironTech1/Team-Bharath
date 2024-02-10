package Car;

public abstract class Car {

	int speed;
	String color;
	String model;
	
	
	public void getCarDetails() {
		
		System.out.println("Car Speed "+speed);
		
		System.out.println("Car color "+color);
		
		System.out.println("Car model "+model);
		
		
	}
	
	abstract void applyAccelerator(int speed,String model);
	
	abstract void applyBreak(int speed);
	

}