package TrainingSet3;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int numberOfTerms = scanner.nextInt();

        System.out.println("Fibonacci series up to " + numberOfTerms + " terms:");

        printFibonacciSeries(numberOfTerms);
    }

    private static void printFibonacciSeries(int numberOfTerms) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

