package example;

import java.util.Scanner;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		int a[]= {1,2,3,4,5};
		
		System.out.println("Enter the value");
		
		int value=s.nextInt();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==value ) {
			

				System.out.println("Array elements is found at the index : "+ i);
				
			}
			else if(i==a.length-1){

				System.out.println("Array elements not found");
			}

				
			}

	}

}
