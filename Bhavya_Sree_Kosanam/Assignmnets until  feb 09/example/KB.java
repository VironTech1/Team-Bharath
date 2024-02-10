package example;

import java.util.Scanner;

public class KB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Do u want to convert Kb to mb");
		System.out.println("Enter ur response");
		String Response=s.next();
		
		if(Response.equals("True")){
			
			System.out.println("Enter the Kb");
			int kb=s.nextInt();
		
			
			System.out.println("Gb:"+ (kb/1024));
			System.out.println("mb:"+ (kb/1000));
			
			
		}

		else if(Response.equals("False")) {
			
			System.out.println("Enter the Gb");
			int gb=s.nextInt();
		
			
			System.out.println("Kb :"+ (gb*1000));
			System.out.println("mb:"+ (gb*1024));
			
			
			
		}
		else {
			System.out.println("invalid convertion");
		}


	}

}
