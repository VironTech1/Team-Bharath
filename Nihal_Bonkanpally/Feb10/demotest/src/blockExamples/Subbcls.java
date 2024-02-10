package blockExamples;

public class Subbcls
{
    static int a=10;
    int b=20;
    static void me1()
    {
        System.out.println("This is in Static method");
        System.out.println("This is Static variable:"+a);
        System.out.println("we cannot access instance variable");
        System.out.println("===================================");
    }
    void me2()
    {
        System.out.println("this is in instance method");
        System.out.println("This is Static variable:"+a);
        System.out.println("this is a instance variable:"+b);
        System.out.println("==================================");
    }
    static{
        System.out.println("this Static block in Sub-class-->Subbcls");
        System.out.println("This is static block");
        System.out.println("This is Static variable:"+a);
        System.out.println("==================================");
    }
}
