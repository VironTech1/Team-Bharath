package assignment;

public class Swap
{
    public static void main(String[] args)
    {
        int a=2,b=3,c;
        System.out.println("Before swap");
        System.out.println("the value in variable a:"+a);
        System.out.println("the value in variable b:"+b);
        System.out.println("After swap");
        c=a;
        a=b;
        b=c;
        System.out.println("the value in variable a:"+a);
        System.out.println("the value in variable b:"+b);
    }
}
