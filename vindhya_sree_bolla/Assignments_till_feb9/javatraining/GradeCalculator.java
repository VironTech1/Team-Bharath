package javatraining;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double average = scan.nextDouble();
		if(average>=90) {
			System.out.println("Student passed with Distinction");
		}else if(average>=80) {
			System.out.println("Student passed with First Class");
		}else if(average>=70) {
			System.out.println("Student passed with Second Class");
		}else if(average<=60 && average>=35) {
			System.out.println("Student passed with Third Class");
		}else {
			System.out.println("Student failed");
		}
	}

}
