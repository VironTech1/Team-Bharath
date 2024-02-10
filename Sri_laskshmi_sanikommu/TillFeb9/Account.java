import java.util.Scanner;

public class Account {
    int accountNumber;
    String accountName;
    double balance;
    long phoneNumber;
    Address address;

    Account(int accNum,String acctName,int bal,long phone,Address add){
        this.accountNumber = accNum;
        this.accountName = acctName;
        this.balance = bal;
        this.phoneNumber = phone;
        this.address = add;
    }

    void getDetails(){
        System.out.println("**************************************************");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Name: "+accountName);
        System.out.println("Account Balance: "+balance);
        System.out.println("PhoneNumber: "+phoneNumber);
        System.out.println("Address: "+address.addressLine+" "+address.city+" "+address.state+" "+address.pincode);
    }

    void Withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("Enter the amount to Withdraw: ");
        double Amount = input.nextDouble();
        input.close();
        if(Amount <= balance){
            balance = balance-Amount;
            System.out.println("**************************************************");
            System.out.println("Your Balance after Withdraw is: "+balance);
        }
        else{
            System.out.println("**************************************************");
            System.out.println("You dont have enough balance to withdraw "+Amount+"\nYour Account Balance: "+balance);
        }
    }

    void Deposit(){
        Scanner input = new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("Enter the amount to Deposit: ");
        double Amount = input.nextDouble();
        input.close();
        balance = balance+Amount;
        System.out.println("**************************************************");
        System.out.println("Your Balance after Deposit is: "+balance);
    }
}

class Address{
    String addressLine;
    String city;
    String state;
    int pincode;

    Address(String addressLine,String city,String state,int pincode){
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}


class AccountMain{
    public static void main(String[] args) {
        Address add1 = new Address("923 W University Ave", "Flagstaff", "Arizona", 86001);
        Account acc1 = new Account(1001, "Srinu", 100000, 949406061, add1);
        acc1.getDetails();
        Address add2 = new Address("800 W University Ave", "NewYork", "NewYork", 10080);
        Account acc2 = new Account(1002, "Vels", 200000, 949466461, add2);
        acc2.getDetails();
        acc1.Withdraw();
        acc2.Deposit();
    }
}
