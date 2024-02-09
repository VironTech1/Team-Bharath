package Assignmnets;

public abstract class Car {

	int speed;
	String color;
	String model;
	
	
	public void getCarDetails() {
		
		System.out.println("Enter the  Car Speed "+speed);
		
		System.out.println("Enter the  car color "+color);
		
		System.out.println("Enter the car model "+model);
		
		
	}
	
	abstract void applyAccelerator(int speed,String color);
	
	abstract void applyBreak(int speed);
	

}
