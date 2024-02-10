package assignment;

import java.util.*;
public class Binary
{
    public static void main(String[] args)
    {
        System.out.println("enter the number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[32];
        int i=0;
        while(n>0)
        {
            a[i]=n%2;
            n=n/2;
            i++;
        }
      for(int j=i-1;j>=0;j--) System.out.print(a[j]);
    }
}
