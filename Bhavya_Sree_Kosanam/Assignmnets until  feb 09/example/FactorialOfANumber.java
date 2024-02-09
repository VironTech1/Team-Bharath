package example;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enetr a number ");
		
		int a=s.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++) {
			
			 fact=i*fact;
			
			
		}
		System.out.println(fact);
		
	}

}
