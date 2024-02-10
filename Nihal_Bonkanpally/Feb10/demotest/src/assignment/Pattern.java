package assignment;

import java.util.*;
public class Pattern
{
    public static void main(String[] args)
    {
       Scanner s =new Scanner(System.in);
        System.out.println("enter the number to print");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j!=0;j--)
            {
                System.out.print(" ");
            }
            for (int j = i; j!=0; j--)
            {
               // System.out.println(" ");
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
