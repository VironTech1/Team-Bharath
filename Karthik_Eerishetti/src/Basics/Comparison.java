package Basics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int variable=scanner.nextInt();
        System.out.println("Enter second number");
        int number= scanner.nextInt();
        if (variable==number) {
            System.out.println("Both numbers are equal");

        }
       else{ System.out.println("Both numbers are not equal");
       }



    }
}
