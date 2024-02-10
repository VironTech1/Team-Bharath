package javatraining;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double cp = scan.nextInt();
		double sp = scan.nextInt();
		double discount = cp-sp;
		double discountPercentage = discount*100/cp;
		System.out.println(discountPercentage);
	}

}
