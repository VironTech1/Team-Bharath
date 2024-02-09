package TrainingSet4;

class Carz {
	private boolean isMoving;
	private String car;
	
	
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public Carz(String car) {
		this.car = car;
	}
	public void start() {
		if(!isMoving) {
			System.out.println("Car started moving");
			isMoving = true;
		}else {
			System.out.println("Is already moving");
		}
	}
	public void stop() {
		if(isMoving) {
			System.out.println("Car has stopped");
			isMoving = false;
		}else {
			System.out.println("Car is already stationary");
		}
	}
	public boolean isMoving() {
		return isMoving;
	}

}

class Drive{
	private String name;
	
	public Drive(String name) {
		this.name = name;
	}
	public void driveCar(Carz car) {
		System.out.println(name+" has started the "+ car.getCar() + ".");
		car.start();
	}
	public void parkCar(Carz car) {
		System.out.println(name+" has parked the "+ car.getCar() + ".");
		car.stop();
	}
	
}
public class CarMotion{
	public static void main(String[] args) {
		Carz myCar = new Carz("Car1");
		Drive name = new Drive("Vins");
		name.driveCar(myCar);
		System.out.println("Is the car moving?: "+myCar.isMoving());
		name.parkCar(myCar);
		System.out.println("Is the car moving?: "+myCar.isMoving());
	}
}

