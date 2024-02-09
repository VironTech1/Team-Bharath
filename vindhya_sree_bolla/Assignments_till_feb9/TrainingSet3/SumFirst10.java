package TrainingSet3;

import java.util.Scanner;

public class SumFirst10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = (double)n*(n+1)/2;
		System.out.println(sum);
	}

}
