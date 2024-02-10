package assignment;

import java.util.*;
public class Fibonacci
{
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
        System.out.println("enter how many digits you want to print");
        int n= s.nextInt();
        int a=0,b=1,r=0;
        if(n==1) System.out.println("0");
        if(n==2) System.out.println("1");
        for(int i=2;i<n;i++)
        {
            r=a+b;
            a=b;
            b=r;
        }

        System.out.println("the "+n+"th digit is "+r);
    }
}
//0,1,1,2,3,5,8
