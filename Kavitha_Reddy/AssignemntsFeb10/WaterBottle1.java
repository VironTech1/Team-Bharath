package com;

class WaterBottle1 extends WaterBottle {
    public WaterBottle1(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
    }

    @Override
    public void fill(int amount) {
        if (WaterLevel + amount <= Capacity) {
            WaterLevel += amount;
            System.out.println("Filled " + amount + " units of water. Current water level: " + WaterLevel);
        } else {
            System.out.println("Cannot fill beyond the bottle capacity. Maximum capacity: " + Capacity);
        }
    }

    @Override
    public void sip(int amount) {
        if (WaterLevel - amount >= 0) {
            WaterLevel -= amount;
            System.out.println("Sipped " + amount + " units of water. Current water level: " + WaterLevel);
        } else {
            System.out.println("Not enough water to sip.");
        }
    }
}

