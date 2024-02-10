package TrainingSet4;

public class Car {
	private int speed;
	
	public Car(int speed) {
		this.speed= speed;
	}
	
	public int accelerate(int speed, int accelerated) {
		System.out.println("After acceleration: "+(speed+accelerated));
		return speed+accelerated;
	}
	public int brake(int speed, int reduced) {
		System.out.println("After applying brake: "+(Math.max(0, speed-reduced)));
		return (Math.max(0, speed-reduced));
	}
	public static void main(String[] args) {
		int speed = 60;
		Car car = new Car(speed);
		speed = car.accelerate(speed, 15);
		speed = car.brake(speed, 20);
		speed = car.brake(speed, 80);
	}

}
