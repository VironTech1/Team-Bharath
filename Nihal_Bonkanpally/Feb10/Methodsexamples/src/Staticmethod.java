import java.util.*;
public class Staticmethod
{
    public static void main(String[] args)
    {
       System.out.println("Enter the value of two numbers");
       Nonstaticmethod obj=new Nonstaticmethod();
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       int d=s.add();
    }
}
public class Nonstaticmethod
{
    int add(int a,int b)
    {
        return a+b;
        //System.out.println("we in non static method");
    }
}


