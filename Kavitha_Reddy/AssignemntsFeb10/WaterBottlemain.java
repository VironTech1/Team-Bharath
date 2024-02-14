package com;

import java.util.Scanner;

public class WaterBottlemain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
	        WaterBottle1 w=new WaterBottle1(0);
			
			System.out.println("Enter the number");
			
			w.Capacity=s.nextInt();
			w.Color=s.next();
			w.Length=s.nextInt();
			w.WaterLevel=s.nextInt();
			
			
			w.Details();
			w.sip(20);
			w.fill(30);
			
			
	    }
	}
	
