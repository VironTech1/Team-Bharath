import java.util.*;//importing required libraries
public class Question3
{
    public static void main(String[] args)//main class
    {
        Scanner s=new Scanner (System.in);//creating new object
        System.out.println("enter the number:");
        double m=s.nextDouble();
        double c=1.609;//1mile equal to 1.609 km
        System.out.println("Miles         Kilometers");
        System.out.println("------------------------");
        for(int i=1;i<=m;i++){//entering into for loop
            System.out.print(i+"             ");
            System.out.printf( "%.3f",(i*c));//printing the result using printf formatter
            System.out.println();
        }



    }
}
