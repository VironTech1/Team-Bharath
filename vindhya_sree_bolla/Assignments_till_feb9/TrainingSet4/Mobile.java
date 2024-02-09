package TrainingSet4;

public class Mobile {
	private double balance;
	
	public Mobile(double balance) {
		this.balance = balance;
	}
	
	public double recharge(double balance, double newTopup) {
		System.out.println("New balance after recharge: "+(balance+newTopup));
		return balance+newTopup;
	}
	public double makeCall(double balance, double callCharge) {
		System.out.println("New balance after recharge: "+Math.max(0,(balance-callCharge)));
		return Math.max(0,(balance-callCharge));
	}
	public static void main(String[] args) {
		double balance = 100.00;
		Mobile mobile = new Mobile(balance);
		balance = mobile.recharge(balance, 50.25);
		balance = mobile.makeCall(balance, 25.50);
		balance = mobile.makeCall(balance, 125.00);
	}

}
