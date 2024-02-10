package javatraining;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        System.out.println("Select a currency to convert to:");
        System.out.println("1. Euro (EUR)");
        System.out.println("2. British Pound (GBP)");
        System.out.println("3. Japanese Yen (JPY)");

        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        double convertedAmount;

        switch (choice) {
            case 1:
                convertedAmount = usdAmount * 0.85; 
                System.out.printf("%.2f USD is equal to %.2f EUR%n", usdAmount, convertedAmount);
                break;
            case 2:
                convertedAmount = usdAmount * 0.73; 
                System.out.printf("%.2f USD is equal to %.2f GBP%n", usdAmount, convertedAmount);
                break;
            case 3:
                convertedAmount = usdAmount * 109.88; 
                System.out.printf("%.2f USD is equal to %.2f JPY%n", usdAmount, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
        }
    }
}

