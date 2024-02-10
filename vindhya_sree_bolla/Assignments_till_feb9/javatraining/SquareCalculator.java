package javatraining;

import java.util.Scanner;

public class SquareCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.printf("Square of %d is %d", number, number*number);
	}

}
