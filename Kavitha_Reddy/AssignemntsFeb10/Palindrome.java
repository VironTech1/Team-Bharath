package com;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=343;
		int num1=num;
		int reversenumber=0;
		
		while(num!=0) {
			
			int digit=num%10;
			reversenumber=reversenumber*10+digit;
			num=num/10;
		}
		
		System.out.println(reversenumber);
		
		if(num1==reversenumber) {
			
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		

	}

}
