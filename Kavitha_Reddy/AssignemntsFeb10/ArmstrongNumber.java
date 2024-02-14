package com;
import java.util.Scanner;
public class ArmstrongNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	        scanner.close();
	    }

	    static boolean isArmstrong(int num) {
	        int originalNum = num;
	        int sum = 0;
	        int digitCount = countDigits(num);

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, digitCount);
	            num /= 10;
	        }

	        return sum == originalNum;
	    }

	    static int countDigits(int num) {
	        int count = 0;
	        while (num > 0) {
	            num /= 10;
	            count++;
	        }
	        return count;
	    }
	}



