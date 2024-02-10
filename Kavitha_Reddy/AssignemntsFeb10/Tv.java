package com;

public abstract class Tv {
	
	
	String brand;
	String model;
	String color;
	
	public void getDetails() {
		
		System.out.println("Enter barnd"+brand);
		System.out.println("Enter car model"+model);
		System.out.println("Enter the color"+color);
	}
	
	abstract void changeChannel();
	abstract void increaseVolume();
	abstract void decreaseVolume();

}
