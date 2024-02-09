package TrainingSet4;

public class WaterBottle {
	private int capacity;
	private int waterLevel;
	
	public WaterBottle(int capacity) {
		this.capacity = capacity;
		this.waterLevel = 0;
	}
	public void fill(int amount) {
		if(amount>0) {
			waterLevel = Math.min(waterLevel+amount, capacity);
			System.out.println("Bottle is filled. Water Level is: "+waterLevel);
		}else {
			System.out.println("Amount must be greater than zero for filling");
		}
	}
	public void sip(int amount) {
		if(amount>0) {
			waterLevel = Math.max(waterLevel-amount, 0);
			System.out.println("Sipped from water bottle. Water level is: "+waterLevel);
		}else {
			System.out.println("Amount must be greater than zero for sipping");
		}
	}
	public void empty() {
		waterLevel = 0;
		System.out.println("Bottle is emptied. Water level is: "+waterLevel);
	}
	
	public static void main(String[] args) {
		WaterBottle bottle = new WaterBottle(150);
		bottle.fill(100);
		bottle.sip(20);
		bottle.empty();
		
	}

}
