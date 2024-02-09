package example;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		int a[]=new int[10];
		int k=0;
		
		while(num!=0) {
			
			int digit=num%2;
			a[k]=digit;
			num/=2;
			k++;
			
		}
		for(int i=k-1;i>=0;i--)
		System.out.print(a[i]);

	}

}
