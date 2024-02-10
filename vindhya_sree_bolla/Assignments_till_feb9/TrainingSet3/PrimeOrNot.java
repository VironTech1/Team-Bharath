package TrainingSet3;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean check = false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				check = true;
				break;
			}
		}
		if(!check) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not a prime");
		}
		
	}

}
