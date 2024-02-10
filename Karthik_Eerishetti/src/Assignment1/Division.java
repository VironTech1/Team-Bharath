package Assignment1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int v1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int v2 = scanner.nextInt();
        System.out.println("Division is "+(v1/v2));
    }
}
