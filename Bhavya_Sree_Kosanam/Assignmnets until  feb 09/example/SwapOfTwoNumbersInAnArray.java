package example;

import java.util.Scanner;

public class SwapOfTwoNumbersInAnArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		
		System.out.println("Enter two index in an array :");
		int element1=s.nextInt();
		int element2=s.nextInt();
		
		int temp;
		
		temp=a[element1];
		a[element1]=a[element2];
		a[element2]=temp;
		
		for(int i=0;i<a.length;i++) {
		
		System.out.println(a[i]);

	}
	}
	

}
