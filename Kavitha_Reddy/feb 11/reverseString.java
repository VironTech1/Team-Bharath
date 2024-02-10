package feb;


import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string");
	        String str=s.nextLine();
	        String reverse="";
	 
		for(int i=str.length()-1;i>=0;i--) {
	    	   reverse+=str.charAt(i);
	        }
	        System.out.println(reverse);
	    	   
	    	   
	       }
	       }
	    
	

	