package feb;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string");
	        String str=s.nextLine();
	       String rev="";
			
	        for(int i=str.length()-1;i>=0;i--) {
	        	rev+=str.charAt(i);
		        }
				if(str.equals(rev))
				System.out.println("palindrome");
			
	        else {
				System.out.println("not a palindrome");
			}
}}
