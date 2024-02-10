package student;
import java.util.*;
public class EmployeeMain {
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
        EmployeeData ed=new EmployeeData(id2,nme,design);
        EmployeeContact ec=new EmployeeContact(em,p);
        EmployeeAddress ea=new EmployeeAddress(ehouse,snam,can,pcod);
        EmployeeSalary es=new EmployeeSalary(i);
        ed.getemployeeData();
        ec.getEmployeeContact();
        ea.getemployeeAdd();
        es.EmployeSal();

    }

}
