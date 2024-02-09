package example;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter a First number ");
	int first =s.nextInt();
	
	if(first%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
}

}
