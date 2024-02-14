package com;

public class multiplicationnm {

	    public static void main(String[] args) {
	        int n = 10;  
	        long product = 1; 

	        for (int i = 1; i <= n; i++) {
	            product *= i;
	        }

	        
	        System.out.println("Multiplication of first " + n + " natural numbers: " + product);
	    }
	}

