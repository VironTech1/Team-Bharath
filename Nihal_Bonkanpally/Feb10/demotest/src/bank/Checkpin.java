package bank;

import java.util.*;
public class Checkpin
{
    boolean check(int n)
    {
        Scanner s1=new Scanner(System.in);
        for(int i=1;i<3;i++)
        {
            if ((n == 1111) || (n == 2222)) {
                System.out.println("Entered pin is valid");
                return true;
            }
            else
            {

                System.out.println("Entered pin is invalid and re-enter the pin");
                n = s1.nextInt();
            }
        }
        return false;
    }
}
