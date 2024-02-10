package subclassproblem;

public class Memoryalloction
{
    int a=10;
    static int b=20;

    public static void main(String[] args) {
        int c=30;
        Memoryalloction j=new Memoryalloction();
        System.out.println(j.a);
        System.out.println(b);
        System.out.println(c);
    }
}
