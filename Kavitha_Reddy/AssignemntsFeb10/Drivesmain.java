package com;

import java.util.*;
public class Drivesmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		
		Car1 d=new Car1();
		
		System.out.println("Enter the values");
		
		d.brand=s.next();
		d.model=s.next();
		d.color=s.next();
		d.speed=s.nextInt();
		d.carnumber=s.next();
		
		
		d.getDetails();
		d.DrivesCar();
		d.CarMoves();
		

	}

}
