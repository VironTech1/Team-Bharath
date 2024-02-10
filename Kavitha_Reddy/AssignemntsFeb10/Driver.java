package com;

public abstract class Driver {

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
abstract void DrivesCar();

abstract void Carmoves();

}


class Driver1 extends Driver{
	

	@Override
	void DrivesCar() {
		// TODO Auto-generated method stub
		System.out.println("DrivesCar");
		
	}

	@Override
	void Carmoves() {
	// TODO Auto-generated method stub
	System.out.println("CarMoves");	
	}

}
