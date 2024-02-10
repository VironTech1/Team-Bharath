package example;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		if(a==b) {
			System.out.println("Two numbers are equal");
		}
		else if(a>b){
			System.out.println("A is Greater Than B");
			
		}
		else {
			System.out.println("B is Greater Than A");
		}
	}

}
