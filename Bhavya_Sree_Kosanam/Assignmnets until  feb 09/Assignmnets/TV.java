package Assignmnets;

public abstract class TV {

	int channel;
	int incvolume;
	int decvolume;
	int size;
	String brand;
	String color;

	
	public void display() {
		
		
		System.out.println("Enter the size of the TV"+size);
		System.out.println("Enter the brand of the Tv"+brand);
		System.out.println("Enter the color of the TV"+color);
		
	}
	
	
	abstract void changeChannel(int channel);
	abstract void increaseVolume(int incvolume);
	abstract void decreaseVolume(int decvolume);
	
	
}
