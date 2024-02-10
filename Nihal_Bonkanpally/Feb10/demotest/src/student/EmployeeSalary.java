package student;

public class EmployeeSalary
{
    double totsal;
    int bs1;
    public EmployeeSalary(int bs){
        if(bs>12000)
        {
            bs1=bs;
            totsal=(bs+(0.93*bs)+(0.63*bs));

        }

    }
    public void EmployeSal()
    {
       if(bs1>12000) {
           System.out.println("=======Employee Salary=======");
           System.out.println("The total amount for this employee is"+totsal);
       }
       else System.out.println("The amount is not valid ");
    }

}
//read empName,empId,empDesg
// (ii)read bSal
// =>This bSal must be min 12000/-
// (iii)if bSal is validated then calculate totSal
//totSal = bSal + HRA + DA;
//HRA = 93% of bSal
//DA = 63% of bSal