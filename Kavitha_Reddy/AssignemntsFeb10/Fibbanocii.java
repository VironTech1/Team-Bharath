package com;

	import java.util.Scanner;
	public class Fibbanocii {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the limit for Fibonacci series: ");
	        int limit = scanner.nextInt();

	        System.out.println("Fibonacci series up to " + limit + " is:");
	        printFibonacciSeries(limit);

	        scanner.close();
	    }

	    static void printFibonacciSeries(int limit) {
	        int a = 0, b = 1, c;

	        while (a <= limit) {
	            System.out.print(a + " ");

	            c = a + b;
	            a = b;
	            b = c;
	        }
	    }
	}

