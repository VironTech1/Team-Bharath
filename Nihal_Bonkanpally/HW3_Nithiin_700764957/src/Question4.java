import java.util.*;//importing required libraries
public class Question4
{
    public static void main(String[] args)//public class containing main() method
    {
        Scanner s=new Scanner(System.in);//creating new object
        System.out.println("Please enter a value(>0) or terminate with -1:");
        int e=s.nextInt();
        int sum=0,l=0;
        while(e!=-1)//entering sentinel loop,loop exits when entered value(-1)
        {
            sum=sum+e;
            System.out.println("Please enter a value(>0) or terminate with -1:");
            e=s.nextInt();
            l++;
        }
        System.out.println("sum of all number:"+sum);
        double ag=(double)sum/l;//type casting int to double
        System.out.println("average of all:"+ag);

    }
}
