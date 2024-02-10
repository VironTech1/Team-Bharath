package constructorExamples;
import p1Package.Mclass1;
import java.util.*;
public class PackageExample
{
    public static void main(String[] args)
    {
        Scanner dq=new Scanner(System.in);
        System.out.println("Enter the first  value:");
        int a1=dq.nextInt();
        System.out.println("Enter the second value:");
        int b1=dq.nextInt();
        System.out.println("Enter the third value:");
        int c1= dq.nextInt();
        Mclass1 mc1=new Mclass1(a1,b1,c1);
        mc1.setss();
    }
}
