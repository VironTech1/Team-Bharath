package example;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int num=s.nextInt();
		int num1=num;
		int reversenum=0;
		
		while(num!=0) {
			
			int digit=num%10;
			reversenum=reversenum*10+digit;
			num/=10;
			
			
		}
		System.out.println(reversenum);
		
		if(num1==reversenum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}


	}

}
