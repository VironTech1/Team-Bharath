package example;

import java.util.Scanner;

public class KG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner s= new Scanner(System.in);
				
				System.out.println("Do u want to convert Kilogram to Gram");
				System.out.println("Enter ur response");
				String Response=s.next();
				
				if(Response.equals("True")){
					
					System.out.println("Enter the Kilogram");
					int k=s.nextInt();
				
					
					System.out.println("Grams :"+ (k/1000));
					
					
				}

				else if(Response.equals("False")) {
					
					System.out.println("Enter the Gram");
					int g=s.nextInt();
				
					
					System.out.println("KiloGram :"+ (g*1000));
					
					
					
				}
				else {
					System.out.println("invalid convertion");
				}

	}

}
