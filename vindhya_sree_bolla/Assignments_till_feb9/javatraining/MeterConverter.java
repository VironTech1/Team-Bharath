package javatraining;

import java.util.Scanner;

public class MeterConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the kilometer value: ");
		double kilometers = scan.nextDouble();
		double meters = 1000 * kilometers;
		double centimeters = 100000 * kilometers;
		
		System.out.println("Enter the meter value: ");
		double meterInput = scan.nextDouble();
		
		double kilometerOutput = meterInput/1000;
		double centimeterOutput = meterInput * 100;
		
		System.out.printf("%.2f kilometers are equal to %.2f meters and %.2f centimeters%n", kilometers, meters, centimeters);
		System.out.printf("%.2f meters are equal to %.2f kilometers and %.2f centimeters%n", meterInput, kilometerOutput, centimeterOutput);
	}

}
