import java.util.*;//importing required libraries
public class Question5
{
    public static void main(String[] args)//main class
    {
        System.out.println("Enter 10 values:");
        Scanner s=new Scanner(System.in);//creating new object
        int []a=new int[10];//initializing array
        for(int i=0;i<10;i++)//initializing array values
        a[i]=s.nextInt();
        int small=a[0];
        for(int i=0;i<10;i++)
        {
            if(a[i]<small)//comparing each loop number to small
            {             //then swapping it
              small=a[i];
            }
        }
        System.out.println("The smallest value is:"+small);//printing smallest value in array
    }
}
