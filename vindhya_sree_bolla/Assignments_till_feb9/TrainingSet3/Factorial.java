package TrainingSet3;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to which factorial needs to be calculated");
		int n = scan.nextInt();
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial *= i;
		}
		System.out.println("Factorial is: "+factorial);
	}

}
