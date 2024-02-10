
package com;
import java.util.Scanner;

abstract class Operation {
    abstract void perform();
}

class AdditionOperation extends Operation {
    @Override
    void perform() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result of addition: " + result);
    }
}

class SubtractionOperation extends Operation {
    @Override
    void perform() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result of subtraction: " + result);
    }
}

class StartOperation extends Operation {
    @Override
    void perform() {
        System.out.println("Starting a dummy operation. No actual computation performed.");
    }
}

class WeightConversionOperation extends Operation {
    @Override
    void perform() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in Kilograms: ");
        double weightInKg = scanner.nextDouble();
        double weightInPounds = weightInKg * 2.20462;
        System.out.println("Weight in Pounds: " + weightInPounds);
    }
}

class DistanceConversionOperation extends Operation {
    @Override
    void perform() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in Kilometers: ");
        double distanceInKm = scanner.nextDouble();
        double distanceInMiles = distanceInKm * 0.621371;
        System.out.println("Distance in Miles: " + distanceInMiles);
    }
}

 