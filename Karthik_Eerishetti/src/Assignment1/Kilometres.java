package Assignment1;

import java.util.Scanner;

public class Kilometres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int numInM = num * 1000;
        System.out.println("The given number in m is : "+numInM);
    }
}
