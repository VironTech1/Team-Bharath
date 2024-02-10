package blockExamples;

public class Blockexample2
{
    int g=30;
    static int h=40;
    public static void main(String[] args)
    {
      Subbcls2 ob=new Subbcls2();//at this time object is created and instance block in subclass is called
      ob.m3();
      Blockexample2 n2=new Blockexample2();//this is object creation here the instance block is called
    }
    {
        System.out.println("This is in the main class instance block");
        System.out.println(h);
        System.out.println(g);
        System.out.println("===========================");
    }
}
