package javatraining;

import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String output = (a<b)? "a is less than b":"a is greater than b";
		System.out.println(output);
	}

}
