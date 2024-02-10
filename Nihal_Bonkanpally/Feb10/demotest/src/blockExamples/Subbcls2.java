package blockExamples;

public class Subbcls2
{
    int o=10;
    void m3(){
        System.out.println("In the instance method");
        System.out.println("=======================");
    }
    {
        System.out.println("In the instance block of subclass---->Subbcls2");
        System.out.println("instance variable:"+o);
        System.out.println("=====================");
    }
}
