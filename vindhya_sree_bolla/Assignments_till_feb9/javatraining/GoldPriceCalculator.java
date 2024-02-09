package javatraining;
import java.util.Scanner;

public class GoldPriceCalculator {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the weight of gold in grams: ");
	        double goldWeight = scanner.nextDouble();

	        System.out.print("Enter the number of stones: ");
	        int numberOfStones = scanner.nextInt();

	        double goldRatePerGram = 5250;
	        double stoneRate = 1500;
	        double makingChargePercentage = 10; 

	        double goldPrice = goldWeight * goldRatePerGram;
	        double stonePrice = stoneRate * numberOfStones;
	        double makingCharge = (makingChargePercentage / 100) * goldPrice;

	        double totalPrice = goldPrice + stonePrice + makingCharge;

	        System.out.printf("Total Price: Rs. %.2f%n", totalPrice);
	    }

}



