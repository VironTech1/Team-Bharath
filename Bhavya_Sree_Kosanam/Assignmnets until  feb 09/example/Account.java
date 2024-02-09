package example;


class Account1{
	long accountnumber;
	String acctname;
	double balance;
	long phonenumber;
	String address;
}

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account1 acc=new Account1();
		acc.accountnumber=111234555l;
		acc.acctname="bhavya";
		acc.balance=5000;
		acc.phonenumber=1234567856;
		acc.address="Glenmareypoint";
		
		//Get details
		
		System.out.println("Account Number"+acc.accountnumber+"\n Account Nmae "+ acc.acctname+"\n Account Balance "+acc.balance+"\n Account Phone Number " +acc.phonenumber+"\n Address "+ acc.address);
		
		
		// With Draw
		
		System.out.println("Before With draw");
		System.out.println("balance"+acc.balance);
		
		acc.balance=acc.balance-500;
		
		
		System.out.println("After withdraw");
		System.out.println("total balance"+ acc.balance);
		
		//Deposite
		
		System.out.println("Before deposite");
		System.out.println("Balance"+acc.balance);
		
		acc.balance=acc.balance+1000;
		
		
		System.out.println("After deposite");
		
		//Total Amount
		
		System.out.println("Total balance"+ acc.balance);
		
		
		
		

	}

}
