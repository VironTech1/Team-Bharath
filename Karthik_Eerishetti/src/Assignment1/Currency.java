package Assignment1;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value in USD: ");
        int money = scanner.nextInt();

        int moneyInINR = money*83;
        System.out.println("Amount in INR: "+moneyInINR);
        double moneyInEuros = money*0.92;
        System.out.println("Amount in Euros: "+moneyInEuros);
        double moneyInPounds = money*0.79;
        System.out.println("Amount in Pounds: "+moneyInPounds);

    }
}
