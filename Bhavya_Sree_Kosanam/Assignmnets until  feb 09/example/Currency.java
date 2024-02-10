package example;
import java.util.*;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose the conversion direction
        System.out.println("Choose Currency Conversion:");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        int choice = scanner.nextInt();

        
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double result = 0;

       
        switch (choice) {
            case 1:
                
                result = amount * 73.5; 
                System.out.println(amount + " USD is equal to " + result + " INR.");
                break;

            case 2:
            
            	result = amount / 73.5;
                System.out.println(amount + " INR is equal to " + result + " USD.");
                break;
                
            default:
            	System.out.println("invalid output");
        }
        

	}

}
