package assignment;

import java.util.*;
public class Arraydupilcate
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the n-value");
        int n=s.nextInt();
        System.out.println("enter"+n+" elements into the array:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("duplicate elements in arrays are:");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                    System.out.println(a[j]);
                break;
            }
        }
    }
}
