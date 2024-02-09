package example;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		
		for(int i=2;i<num/2;i++) {
			if(num==2) {
				System.out.println("prime");
				break;
			}
		    else if(num%i==0) {
				System.out.println("not prime");
				break;
			}
			else {
				System.out.println("prime");
				break;
				
			}
		}
		

	}

}
