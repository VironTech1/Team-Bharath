package Assignment;

public class carmain {
    public static void main(String[] args) {
        car Car = new car();
        Car.speed=80;
        System.out.println("The speed of the Car:"+ Car.speed);

        Acceleration acceleration = new Acceleration();
        acceleration.increaseSpeed();
        Slowsdown slow = new Slowsdown();
        slow.Slowsdown();


    }
}
