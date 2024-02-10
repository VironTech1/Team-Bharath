package javatraining;

import java.util.Scanner;

public class EMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter Loan Tenure in Years: ");
        int tenureInYears = scanner.nextInt();
        System.out.print("Enter Annual Interest Rate (%): ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfInstallments = tenureInYears * 12;
        double emi = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfInstallments));
        System.out.printf("EMI for the loan amount %.2f for %d years at %.2f%% interest is: %.2f%n",
                loanAmount, tenureInYears, annualInterestRate, emi);
    }
}

