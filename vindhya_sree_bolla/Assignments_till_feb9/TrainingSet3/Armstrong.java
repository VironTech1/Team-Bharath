package TrainingSet3;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		int num = n;
		
		while(n != 0) {
			sum += (int)Math.pow(n%10, 3);
			n = n/10;
		}
		if(sum == num) {
			System.out.println("Number is an armstrong number");
		}else {
			System.out.println("Number is not an armstrong number");
		}
	}

}