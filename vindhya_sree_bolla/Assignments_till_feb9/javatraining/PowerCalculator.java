package javatraining;

import java.util.Scanner;

public class PowerCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the power units consumed: ");
		double units = scan.nextDouble();
		double bill = 0;
		if(units>=1&&units<=100) {
			  bill = units*3;
		}else if(units>=101&&units<=200) {
			 bill = 100*3 + (units-100)*4;
		}else if(units>=201&&units<=300) {
			 bill = 100*3+100*4+(units-200)*5;
		}else if(units>=301) {
			 bill = 100*3+100*4 + 100*5+ (units-300)*6;
		}
		System.out.println(bill);
	}
}
