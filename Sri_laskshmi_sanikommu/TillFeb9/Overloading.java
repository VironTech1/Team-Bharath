public class Overloading {

    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a+b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a+b+c));
    }

    public void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a+b));
    }

    public static void main(String[] args) {
        Overloading example = new Overloading();
        example.add(10, 20);
        example.add(12.05, 10.50);
        example.add(1, 21, 15);
    }
}
