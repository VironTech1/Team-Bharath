package example;
import java.util.*;
public class CurrentBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
	
		System.out.println("Enter the units");
		int unit=s.nextInt();
		
		if(unit>=1 && unit<=100) {
			System.out.println("Current Bill is 3rs "+unit);
		}
		else if(unit>=101 && unit<=200) {
			System.out.println("Current Bill is 4rs "+unit);
		}
		else if(unit>=201 && unit<=300) {
			System.out.println("Current Bill is 5rs "+unit);
		}
		else {
			
				System.out.println("Current Bill is 6rs "+unit);
			}
		}

	}


