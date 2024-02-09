package javatraining;

import java.util.Scanner;

public class AreaNPerimeter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shape = scan.next();
		double area = 0.0, perimeter = 0.0;
		switch (shape) {
			case "circle":
				int radius = scan.nextInt();
				area = 3.14 * radius * radius;
				perimeter = 2 * 3.14 * radius;
				break;
			case "square":
				int side = scan.nextInt();
				area = side * side;
				perimeter = 4 * side;
				break;
			case "rectangle":
				int length = scan.nextInt();
				int breadth = scan.nextInt();
				area = length * breadth;
				perimeter = 2 * (length + breadth);
				break;
			case "parallelogram":
				int base = scan.nextInt();
				int height = scan.nextInt();
				area = base * height;
				break;
			default:
				System.out.println("Enter valid shape");
		}
		System.out.println("Area of "+shape+": "+area);
		System.out.println("Permiter of "+shape+": "+perimeter);

}
}
