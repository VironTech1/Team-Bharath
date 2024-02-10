package feb;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String str=s.nextLine();
		
         System.out.println("Enter a substring");
		
		String sub=s.nextLine();
		
		if(str.contains(sub)) {
			
			System.out.println("The string is substring");
		}
		else {
			System.out.println("The string is not substring");
		}

	}
	}


