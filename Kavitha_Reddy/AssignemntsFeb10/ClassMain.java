package com;

import java.util.*;
public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		
		Car1 c=new Car1();
		
		System.out.println("Enter the values");
		
		c.brand=s.next();
		c.model=s.next();
		c.color=s.next();
		c.speed=s.nextInt();
		c.carnumber="11-22-456";
		
		
		c.getDetails();
		c.applyAccelerate();
		c.applyBreak();
		

	}

}
