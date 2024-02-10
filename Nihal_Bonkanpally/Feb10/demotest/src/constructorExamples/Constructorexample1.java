package constructorExamples;

public class Constructorexample1
{
    public static void main(String[] args)
    {
      Constructorexample1 m=new Constructorexample1();
      Subbcls3 j=new Subbcls3();
      j.m4();
    }
    Constructorexample1()
    {
        System.out.println("this is the constructor in the main class");
        System.out.println("===========================");
    }
}
