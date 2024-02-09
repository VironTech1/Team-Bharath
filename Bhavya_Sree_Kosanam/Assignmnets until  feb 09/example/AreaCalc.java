package example;

public class AreaCalc {
	
	void area(int a) {
		
		
		double cricle=(Math.PI)*a*a;
		
		System.out.println("Area of a cricle is "+cricle);
		
	}
	
	void area(int a,int b) {
		
		int rectangle= a*b;
		System.out.println("Area of a Rectangle is "+rectangle);
		
		
		
	}
	
	
	void area(double b,double h) {
		
		double triangle=0.5*b*h;
		System.out.println("Area of a triangle is "+triangle);
		
		
	}
	
	void area(float l) {
		
		float square=l*l;
		System.out.println("Area of a Sqaure"+square);
	}
	
	
}
