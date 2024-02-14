package com;

public class Findnumberarray {
	    public static void main(String[] args) {
	        int[] numbers = {5, 10, 15, 20, 25}; 
	        int target = 15; 
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == target) {
	                System.out.println("The number " + target + " is found at index " + i);
	                return; 
	            }
	        }

	        System.out.println("The number " + target + " is not found in the array.");
	    }
	}
