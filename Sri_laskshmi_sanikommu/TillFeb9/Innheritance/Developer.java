package Innheritance;

public class Developer extends Employee {
    int noOfLines;;
    int noOfMethods;
    double noOfClasses;
    
    public void writeCode(){
        System.out.println("Developers write code");
    }
    public void integrateCode(){
        System.out.println("Integrate code");
    }
    public void role(){
        System.out.println("Your role is Developer");
    }
    
}
