package Innheritance;
public class Employee {
    int employeeId;
    String name;
    double salary;

    public void registerAttendance(){
        System.out.println("Attendance Registered!");
    }
    public void applyLeave(){
        System.out.println("Leave Applyed!");
    }
    public void role(){
        System.out.println("You are not assigned to any role");
    }
    
}

class EmployeeMain{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.employeeId = 1001;
        e1.name = "Sam";
        e1.salary = 200000;
        //e1.applyLeave();
        e1.role();

        Developer d1 = new Developer();
        d1.employeeId = 1002;
        d1.name = "Lakshmi";
        d1.salary = 400000;
        d1.noOfLines = 10000;
        d1.noOfMethods = 200;
        d1.noOfClasses = 300;
        d1.applyLeave();
        d1.writeCode();
        d1.role();

        Tester t1 = new Tester();
        t1.employeeId = 1003;
        t1.name = "Ram";
        t1.salary = 100000;
        t1.noOfTestcases = 500;
        t1.noOfBugs = 100;
        t1.applyLeave();
        t1.testCode();
        t1.role();

    }
}
