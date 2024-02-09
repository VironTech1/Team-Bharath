package TrainingSet3;

import java.util.Scanner;

public class FiveTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter till where you want to print table: ");
		int n = scan.nextInt();
		for(int i=0; i<=n;i++) {
			System.out.println("5 * "+i+" = "+5*i);
		}
		
	}

}
