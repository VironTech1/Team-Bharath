import java.util.Scanner;//importing required java libraries

public class Question2
{
    public static void main(String[] args)//main class
    {
        Scanner s=new Scanner(System.in);//creating new object
        System.out.println("Please enter a number:");
        int i=s.nextInt();
        System.out.println("Multiplication table for "+i);
        System.out.println(" Multiplier Result");
        System.out.println("--------------------------------");
        for(int n=1;n<=10;n++){//entering into the for loop
            System.out.print(n+"       ");
            System.out.println(n*i);
        }

    }

}
