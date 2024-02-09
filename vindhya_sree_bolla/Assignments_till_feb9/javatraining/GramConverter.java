package javatraining;

import java.util.Scanner;

public class GramConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight in kilograms: ");
		double kilograms = scan.nextDouble();
		double grams = 1000 * kilograms;
		System.out.printf("%.2f kilograms are equal to %.2f grams%n", kilograms, grams);
		
		System.out.println("Enter the weight in grams: ");
		double gramInput = scan.nextDouble();
		
		double kilogramOutput = gramInput/1000;
		
		System.out.printf("%.2f grams are equal to %.2f kilograms%n", grams, kilograms);
	}

}
