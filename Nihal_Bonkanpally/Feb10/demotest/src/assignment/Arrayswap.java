package assignment;

import java.util.*;
public class Arrayswap
{
    public static void main(String[] args)
    {
        Scanner  s=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=s.nextInt();
        int[]a=new int[n];
        System.out.println("enter the elements into the array:");
        for(int l=0;l<n;l++)
        {
            a[l]=s.nextInt();
        }
        System.out.println("enter the indexes you want to swap the numbers and they :");
        int i=s.nextInt();
        int j=s.nextInt();
        System.out.println("before swap");
        for(int k=0;k<n;k++)
        {
            System.out.println(a[k]);
        }
        if((i>=0)&&(i<n)&&(j>=0)&&(j<n))
        {
        System.out.println("after swap");
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        for(int k=0;k<n;k++)
        {
            System.out.println(a[k]);
        }
        }
        else System.out.println("entered indexes can not be swapped");


    }

}
