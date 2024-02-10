package example;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a First number ");
		int first =s.nextInt();
		System.out.println("Enter a second number");
		int second =s.nextInt();
		System.out.println("Enter a Third number");
		int third =s.nextInt();
		
		
		if(first>second && first>third) {
			System.out.println("first number is max");
			
		}
		else if (second>first && second>third) {
			System.out.println("second number is max");
		}
		else {
			System.out.println("third number is max");
			
		}
		

	}

}
