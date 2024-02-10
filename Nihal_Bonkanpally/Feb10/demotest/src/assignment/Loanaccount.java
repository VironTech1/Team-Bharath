package assignment;

import java.util.Scanner;

public class Loanaccount
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal account:");
        int acc= scanner.nextInt();
        System.out.println("enter the interest in %:");
        double m=scanner.nextDouble();
        System.out.println("enter the tenure of the loan:");
        int t= scanner.nextInt();
        t=t*12;
        double r=m/(12*100);
        double emi=(acc*r*Math.pow((1+r),t))/((Math.pow((1+r),t))-1);
        System.out.println("the emi value:"+emi);

    }
}