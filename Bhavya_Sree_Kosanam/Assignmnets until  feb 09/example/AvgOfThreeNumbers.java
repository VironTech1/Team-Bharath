package example;

import java.util.Scanner;

public class AvgOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		System.out.println("Enter c value");
		int c=s.nextInt();
		int avg=(a+b+c)/3;
		System.out.println("Average of 3 numbers is : "+ avg);
		
	}

}
