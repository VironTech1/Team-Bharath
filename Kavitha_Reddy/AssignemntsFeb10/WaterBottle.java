package com;

public abstract class WaterBottle {

	int Capacity;
	int Length;
	String Color;
	int WaterLevel;
	
	
	public void Details()
	{
		System.out.println("Enter the Capacity"+Capacity);
		System.out.println("Enter the Color"+Color);
		System.out.println("Enter the Length"+Length);
		System.out.println("Enter the WaterLevel"+WaterLevel);
		
	}
	public WaterBottle(int capacity) {
        this.Capacity = capacity;
        this.WaterLevel = 0;
	}
	
	public abstract void fill(int amount);
	public abstract void sip(int amount);
	
	public  void empty() {
	    WaterLevel = 0;
    System.out.println("Emptied the bottle.");
}
	
	public int getWaterLevel() {
        return WaterLevel;
    }

    public int getCapacity() {
        return Capacity;
    }
}
