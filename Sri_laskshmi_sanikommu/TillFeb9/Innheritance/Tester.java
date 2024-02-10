package Innheritance;

public class Tester extends Employee {
    int noOfTestcases;;
    int noOfBugs;

    public void testCode(){
        System.out.println("Tester tests code");
    }
    public void integrateCode(){
        System.out.println("Report Bugs in code");
    }
    public void role(){
        System.out.println("Your role is Tester");
    }
}
