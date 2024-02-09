package example;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of terms in the Fibonacci series: ");

        
        int n = scanner.nextInt();

       
        //scanner.close();

      
        System.out.println("Fibonacci series:");

        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

	}

}
