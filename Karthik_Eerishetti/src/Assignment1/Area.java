package Assignment1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        double area = 3.14*radius*radius;
        double perimeter = 2*3.14*radius;
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        double recArea = length*breadth;
        System.out.println("Area of the rectangle is " + recArea);
    }
}
