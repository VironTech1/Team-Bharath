package Assignment1;

import java.util.Scanner;

public class Average {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int a2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int a3 = scanner.nextInt();
        System.out.println("Average is "+(a1+a2+a3)/3);
    }
}
