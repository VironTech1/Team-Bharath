import java.util.*;//importing required libraries
public class Question6
{
    public static void main(String[] args)//main class
    {
        Scanner s=new Scanner(System.in);//new object
        System.out.println("Enter a value 6-10 or 0 to stop: ");
        int e=s.nextInt();//initializing sentinel loop
        int []a=new int[11];
        while(e!=0)//enter the sentinel loop
        {
         a[e]++;
         e=s.nextInt();
        }
     for(int i=6;i<11;i++){
         System.out.println(i+"'s     "+a[i]);//printing the count of each number
     }
    }
}
