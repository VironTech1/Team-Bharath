package com;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a value");
		double a=s.nextDouble();
		
		System.out.println("Enter b value");
		double b=s.nextDouble();
		
		double sum=a+b;
		
		System.out.println("Sum of two numbers is :"+sum);
	}

}
