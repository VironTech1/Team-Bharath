package Assignmnets;

public abstract class Mobile {
	
	
	String brand;
	int size;
	String color;
	int balance;
	
	public void getDetails() {
		
		System.out.println("Enter the Brand");
		System.out.println("ENTER THE SIZE");
		System.out.println("Enter color");
		System.out.println("Enter balance");
	}
	
	abstract void makeRecharge();

	abstract void makeCall();

}
