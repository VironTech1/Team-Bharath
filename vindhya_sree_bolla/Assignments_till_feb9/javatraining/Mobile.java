package javatraining;

class Battery{
	String model;
	String capacity;
	
}

public class Mobile {
	String simModel;
	String screenSize;
	Battery battery;
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.battery = new Battery();
		mobile.battery.model = "ERD BT-402 LI-ION";
		mobile.battery.capacity = "5,000 mAh";
		mobile.simModel = "AT&T";
		mobile.screenSize = "720x1280";
		System.out.println(mobile.battery.model);
		System.out.println(mobile.battery.capacity);
		System.out.println(mobile.simModel);
		System.out.println(mobile.screenSize);
		
	
	}

}
