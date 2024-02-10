package feb;

import java.util.Scanner;

public class Splitstring {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter a string");
			
			String str=s.nextLine();
			
			String a[]=str.split("d");
			
			for(int i=0;i<a.length;i++) {
				
				System.out.println("Split the string"+a[i]);
			}
			
			
		}
		
}
		

		