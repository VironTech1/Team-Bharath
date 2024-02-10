package javatraining;

import java.util.Scanner;

public class MaximumCalculator {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	if(a>b && a>c) {
		System.out.printf("a, %d is greater", a);
	}else if(b>c) {
		System.out.printf("b, %d is greater", b);
	}else {
		System.out.printf("c, %d is greater", c);
	}
}

}
