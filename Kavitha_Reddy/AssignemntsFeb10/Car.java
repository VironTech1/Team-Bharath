package com;

public abstract class Car {
	
	int speed;
	String brand;
	String model;
	String carnumber;
	String color;
	
	public void getDetails() {
		
		System.out.println("Enter car speed"+speed);
		System.out.println("Enter barnd"+brand);
		System.out.println("Enter car model"+model);
		System.out.println("Enter car number"+carnumber);
		System.out.println("Enter the color"+color);
	}
	
	abstract void applyAccelerate();
	
	abstract void applyBreak();
}
