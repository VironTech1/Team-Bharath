package TrainingSet3;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		int num = n;
		while(n != 0) {
			sum = sum * 10 + (n%10) ;
			n = n/10;
		}
		//System.out.println(n);
		if(num==sum) {
			System.out.println("Number is a palindrome");
		}else {
			System.out.println("Number is not a palindrome");
		}
	}

}
