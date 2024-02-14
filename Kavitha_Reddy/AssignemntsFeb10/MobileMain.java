package com;

import java.util.*;
public class MobileMain {

	public static void main(String[] args) {
        
		Scanner s=new Scanner(System.in);
		
		
		Mobile1 m=new Mobile1();
		
		System.out.println("Enter the number");
		
		m.Brand=s.next();
		m.Color=s.next();
		m.Size=s.nextInt();
		
		m.Details();
		m.getbalance();
		m.makecall();
		m.recharge();
		
	}
}
	
