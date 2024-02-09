package javatraining;

import java.util.Scanner;

public class MultipleFive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number%5==0) {
			System.out.println("Number is multiplied by 5");
		}else {
			System.out.println("Number is not multiplied by 5");
		}
	}

}
