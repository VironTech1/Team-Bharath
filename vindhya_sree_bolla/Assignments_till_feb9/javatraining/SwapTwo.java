package javatraining;

import java.util.Scanner;

public class SwapTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int temp = 0;
		System.out.println("Before swap: "+a+", "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swap: "+a+", "+b);
	}

}
