package subclassproblem;

public class Methods
{
    static int a=10;
    int b=20;

    void m2()
    {
        System.out.println(Methods.a);
        System.out.println(b);
    }
    static void m1(){
        Methods n=new Methods();
        System.out.println(a);
        System.out.println(n.b);
    }

    public static void main(String[] args) {
        int c=30;
        Methods ob=new Methods();
        ob.m2();
        Methods.m1();
    }
}
