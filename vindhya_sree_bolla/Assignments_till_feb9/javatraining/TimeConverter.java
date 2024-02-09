package javatraining;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the time in hours: ");
		int hours = scan.nextInt();
		int minutes = 60 * hours;
		int seconds = 60 * 60 * hours;
		
		System.out.println("Enter the time in minutes: ");
		int minuteInput = scan.nextInt();
		
		double hourOutput = (double)minuteInput/60;
		int secondsOutput = minuteInput * 60;
		
		System.out.printf("%d hours are equal to %d minutes and %d seconds%n", hours, minutes, seconds);
		System.out.printf("%d minutes are equal to %.2f hours and %d seconds%n", minuteInput, hourOutput, secondsOutput);
	}
}
