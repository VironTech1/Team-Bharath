import java.util.*;//importing required libraries
public class Question1
{
    public static void main(String[] args)//main class
    {
        Scanner s=new Scanner(System.in);//creating new object
        System.out.println("Please enter a number:");
        int i=s.nextInt();
        System.out.println("Multiplication table for "+i);
        System.out.println(" Multiplier Result");
        System.out.println("--------------------------------");
        int n=1;
        while(n<=10)//entering into while loop
        {
            System.out.print(n+"           ");
            System.out.println(n*i);
            n++;//increment
        }

    }
}
