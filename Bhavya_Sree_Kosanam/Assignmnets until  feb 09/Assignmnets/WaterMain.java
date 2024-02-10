package Assignmnets;

import java.util.Scanner;

public class WaterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		Water1 w=new Water1();
		
		System.out.println("Enter the value");
		
		w.watercapacity=s.nextInt();
		w.waterlevel=s.nextInt();
		
		System.out.println("water filling");
		System.out.println("water sipping");
		System.out.println("water empyting");
		

	}

}
