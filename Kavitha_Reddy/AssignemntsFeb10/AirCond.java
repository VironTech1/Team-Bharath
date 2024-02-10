package com;

public class AirCond {


		private boolean power;

		public void ArCond() {
	        this.power = false;
	    }

	    public void turnOn() {
	        power = true;
	        System.out.println("Remote is ON");
	    }

	    public void turnOff() {
	        power = false;
	        System.out.println("Remote is OFF");
	    }
	}

	// AC Remote class extending Remote
	class AcRemote extends AirCond {
	    private int temperature;
	    private String mode;

	    public AcRemote() {
	        super();
	        this.temperature = 25;
	        this.mode = "Cool";
	    }

	    public void incTemp() {
	        temperature++;
	        System.out.println("Temperature increased to " + temperature);
	    }

	    public void decTemp() {
	        temperature--;
	        System.out.println("Temperature decreased to " + temperature);
	    }

	    public void changeMode(String newMode) {
	        mode = newMode;
	        System.out.println("Mode changed to " + mode);
	    }
	}

	// Example usage
	 class Main {
	    public static void main(String[] args) {
	        AcRemote acRemote = new AcRemote();
	        acRemote.turnOn();
	        acRemote.incTemp();
	        acRemote.changeMode("Heat");
	        acRemote.turnOff();
	    }
	}

	
