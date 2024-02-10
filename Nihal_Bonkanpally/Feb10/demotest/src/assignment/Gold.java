package assignment;

import java.util.*;
public class Gold
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the account of gold you purchased in grams:");
        int g=s.nextInt();
        System.out.println("enter the making charges and it ranges from 10 to 18:");
        int ch=s.nextInt();
        System.out.println("are you adding stone to the gold");
        System.out.println("if yes enter y (or) if no enter n:");
        s.nextLine();
        String op=s.nextLine();
        if(op.equals("y")) System.out.println("Total account will be:"+(((g*5250)+(ch*g))+1500));
        else System.out.println("Total account will be:"+((g*5250)+1500));
    }
}
