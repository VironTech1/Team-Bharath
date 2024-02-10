package student;
import java.util.*;
public class StudentMain
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Studentresult sr=new Studentresult();
        int i=1,tot=0,sub;
        boolean p=false;
        while(i<=6)
        {
            System.out.println("enter the sub "+i+" marks:");
            sub= s.nextInt();
            if((sub<0)||(sub>100)){
                System.out.println("invalid sub marks");
                continue;
            }
            if((sub>=0)&&(sub<=34)){
                p=true;
            }

          tot=sub+tot;
         i++;
        }
        //sd.stuGetDetails();
        sr.calculate(tot,p);
        sr.getResult();
    }
}
