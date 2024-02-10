package bank;

import java.util.*;
public class Bankmain
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the pin");
        int pin= s.nextInt();
        Checkpin m=new Checkpin();
        boolean boo=m.check(pin);
        String con="yes";
        while(!Objects.equals(con, "no")){
        if(boo){
            System.out.println("Enter your choice:");
            System.out.println("1.Deposit   2.Withdraw");
            int choice=s.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the amount you want to deposit");
                    int amount = s.nextInt();
                    Deposit d = new Deposit();
                    d.depo(amount,100000);
                }
                case 2 -> {
                    System.out.println("Enter the amount you want to withdraw");
                    int amoun = s.nextInt();
                    WithDraw w = new WithDraw();
                    w.wdraw(amoun, 100000);
                }
                default -> System.out.println("Entered choice id invalid ");
            }
        }
        else System.out.println("Invalid pin code");
        System.out.println("Do you want to continue the transaction? (yes/no)");
        con= s.next();
    }
    }
}
