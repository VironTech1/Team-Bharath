package com;

import java.util.Scanner;

public class Operationmain {
	class Operation1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nCalculator Operations:");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Start (dummy operation)");
	            System.out.println("4. Weight Conversion (Kilograms to Pounds)");
	            System.out.println("5. Distance Conversion (Kilometers to Miles)");
	            System.out.println("6. Exit");

	            System.out.print("Enter your choice (1-6): ");
	            int choice = scanner.nextInt();

	            Operation operation = Operationmain(choice);
	            if (operation != null) {
	                operation.perform();
	            } else if (choice == 6) {
	                System.out.println("Exiting the calculator. Goodbye!");
	                System.exit(0);
	            } else {
	                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
	            }
	        }
	    }

	    private static Operation Operationmain(int choice) {
	        switch (choice) {
	            case 1:
	                return new AdditionOperation();
	            case 2:
	                return new SubtractionOperation();
	            case 3:
	                return new StartOperation();
	            case 4:
	                return new WeightConversionOperation();
	            case 5:
	                return new DistanceConversionOperation();
	            default:
	                return null;
	        }
	    }
	}}

