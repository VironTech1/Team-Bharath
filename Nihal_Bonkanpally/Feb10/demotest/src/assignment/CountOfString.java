package assignment;
import java.util.*;
public class CountOfString
{
    public static void main(String[] args)
    {
        System.out.println("Enter the String:");
        Scanner s3=new Scanner(System.in);
        String s=s3.next();
        int count1=0,count2=0,count3=0,count4=0;
        for(int i=0;i<s.length();i++)
        {
        int j=((int)(s.charAt(i)));
        if(((j>=65)&&(j<=90))||((j>=97)&&(j<=122))||((j>=48)&&(j<=57)))
        {
        if((j==97)||(j==101)||(j==105)||(j==111)||(j==117)||(j==65)||(j==69)||(j==73)||(j==79)||(j==85))
        {
           count1++;
        }
        else if ((j>=48)&&(j<=57))
        {
            count3++;
        }
        else  {
            count2++;

        }
        }
        else count4++;
        }
        System.out.println("===============================");
        System.out.println("No of vowels in the string is:"+count1);
        System.out.println("No of consonants in the string is:"+count2);
        System.out.println("No of integer values in the string is:"+count3);
        System.out.println("No of other symbols in the string is:"+count4);
    }

}
