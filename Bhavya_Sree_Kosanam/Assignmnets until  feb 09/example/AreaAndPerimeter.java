package example;
import java.util.*;

public class AreaAndPerimeter {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		
		System.out.println(" Enter a value ");
		int a=s.nextInt();
		double area=(Math.PI)*a*a;
		double perimeter= 2*(Math.PI)*a;
		System.out.println(" Area of a Cricle : "+ area);
		System.out.println(" Perimeter of a Cricle : "+perimeter);
		
		
		System.out.println(" Enter the side of a square ");
		int l=s.nextInt();
		int square=l*l;
		int squareperimeter=l+l;
		System.out.println("Area of a Square :"+ square);
		System.out.println(" Perimeter of a Square :" + squareperimeter);
		
		System.out.println(" Enter the length of a rectangle");
		int length=s.nextInt();
		System.out.println(" Enter the Breadth of a rectangle");
		int breadth=s.nextInt();
		int rectangle=length*breadth;
		int perimeter1=2*(length+breadth);
		System.out.println("Area of a Rectangle :"+ rectangle);
		System.out.println(" Perimeter of rectangle :" +perimeter1);
		
		
		System.out.println(" Enter the height of a parallogram");
		int height=s.nextInt();
		System.out.println(" Enter the Breadth of a parallogram");
		int breadth1=s.nextInt();
		System.out.println(" Enter the side of a parallogram");
		int side=s.nextInt();
		int parallogram = height*breadth1;
		int parallogramp=2*(side+breadth1);
		System.out.println("Area of a Parallogram :"+ parallogram);
		System.out.println(" Perimeter of Parallogram :" +parallogramp);


	}

}
