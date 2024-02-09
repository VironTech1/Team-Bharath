package example;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);        
        //System.out.print("Enter a number: ");

        int newnum,sum=0;
		int n=0;
		System.out.println("Enter how many digited number you want to test");
		n=s.nextInt();
		
		System.out.println("Enter number");
		
		newnum=s.nextInt();
		int num1=newnum;
		while (newnum != 0) {
            int d = newnum % 10;
            sum=(int) (sum+Math.pow(d,n));
            newnum /= 10;
		}
		if(num1==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a Armstrong number");

	}

}
