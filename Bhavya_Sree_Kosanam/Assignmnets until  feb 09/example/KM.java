package example;

import java.util.Scanner;

public class KM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Do u want to convert centimeter and meter to kilometer");
		System.out.println("Enter ur response");
		String Response=s.next();
		
		if(Response.equals("True")){
			
			System.out.println("Enter the kilometer");
			int km=s.nextInt();
		
			
			System.out.println("Meters :"+ (km*1000));
			System.out.println("CentiMeters :"+ (km*100000));
			
			
		}

		else if(Response.equals("False")) {
			
			System.out.println("Enter the centimeter");
			int cm=s.nextInt();
		
			
			System.out.println("Meters :"+ (cm/1000.0));
			System.out.println("kiloMeters :"+ (cm/100000.0));
			
			
		}
		else {
			System.out.println("invalid convertion");
		}

	}

}
