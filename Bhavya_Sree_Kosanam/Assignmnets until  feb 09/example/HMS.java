package example;

import java.util.Scanner;

public class HMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Do u want to convert Minutes and Seconds  to Hours");
		System.out.println("Enter ur response");
		String Response=s.next();
		
		if(Response.equals("True")){
			
			System.out.println("Enter the Hours");
			int h=s.nextInt();
		
			
			System.out.println("Minutes :"+ (h*60));
			System.out.println("Second :"+ (h*3600));
			
			
		}

		else if(Response.equals("False")) {
			
			System.out.println("Enter the Second");
			int sec=s.nextInt();
		
			
			System.out.println("Minutes :"+ (sec/60.0));
			System.out.println("Hours :"+ (sec/3600.0));
			
			
		}
		else {
			System.out.println("invalid convertion");
		}


	}

}
