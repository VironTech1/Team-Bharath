package Assignmnets;

import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);		
		Mobile1 m=new Mobile1();
		
		System.out.println("Enter the value");
		
		m.balance=s.nextInt();
		m.brand=s.next();
		m.color=s.next();
		m.size=s.nextInt();
		
		
		m.getDetails();
		m.makeCall();
		m.makeRecharge();
		
	
		

	}

}
