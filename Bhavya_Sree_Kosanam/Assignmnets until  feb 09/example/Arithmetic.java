package example;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		System.out.println("Enter option");
		int option=s.nextInt();
		switch(option) {
		case 1: System.out.println("sum :"+ (a+b));
				break;
		case 2: System.out.println("sub :"+ (a-b));
				break;
		case 3: System.out.println("mul :"+ (a*b));
				break; 
		case 4: System.out.println("Div :"+ (a/b));
				break;
		case 5: System.out.println("modulo :"+ (a%b));
				break;
		default: System.out.println("option was incoorect");
	
		}
		// TODO Auto-generated method stub

	}

}
