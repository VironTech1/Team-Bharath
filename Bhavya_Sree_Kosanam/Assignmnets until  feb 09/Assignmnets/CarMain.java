package Assignmnets;

import java.util.*;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		Car1 c=new Car1();
		
		System.out.println("Enter the details of car");
		
		
		c.speed=s.nextInt();
		c.color=s.next();
		c.model=s.next();		
	
		
		c.getCarDetails();
		c.applyAccelerator(c.speed,c.color);
		c.applyBreak(c.speed);
		
		

	}

}
