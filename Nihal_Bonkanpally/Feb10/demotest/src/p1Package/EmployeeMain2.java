package p1Package;
import student.*;
import java.util.Scanner;

public class EmployeeMain2
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter employee id:");
        String id2= s1.next();
        System.out.println("Enter employee name:");
        String nme= s1.next();
        System.out.println("Enter employee designation:");
        String design= s1.next();
        System.out.println("Enter employee email id:");
        String em= s1.next();
        System.out.println("Enter employee phone number:");
        long p= s1.nextLong();
        System.out.println("Enter employee house number:");
        String ehouse= s1.next();
        System.out.println("Enter employee Street name:");
        String snam= s1.next();
        System.out.println("Enter employee city name:");
        String can= s1.next();
        System.out.println("Enter employee pincode:");
        String pcod= s1.next();
        System.out.println("Enter employee Salary:");
        int i= s1.nextInt();
        EmployeeData ed1=new EmployeeData(id2,nme,design);
        EmployeeContact ec1=new EmployeeContact(em,p);
        EmployeeAddress ea1=new EmployeeAddress(ehouse,snam,can,pcod);
        EmployeeSalary es1=new EmployeeSalary(i);
        ed1.getemployeeData();
        ec1.getEmployeeContact();
        ea1.getemployeeAdd();
        es1.EmployeSal();
    }

}
