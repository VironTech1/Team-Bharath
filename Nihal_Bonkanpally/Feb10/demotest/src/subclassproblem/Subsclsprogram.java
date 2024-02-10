package subclassproblem;
public class Subsclsprogram
{
    public static void main(String[] args) {
        int c=20;
        int d=15;
        Addition ob=new Addition();
        int s=ob.add(c,d);
        System.out.println(s);
        Subtraction obj=new Subtraction();
        int t=obj.sub(c,d);
        System.out.println(t);
    }
}
