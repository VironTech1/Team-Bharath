package javatraining;

import java.util.Scanner;

public class Average3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		double average = (double)(a+b+c)/3;
		System.out.println(average);
	}

}
