package example;

import java.util.Scanner;

public class MethodOverloading {
	
	private int x,y,z;
	
	
	int getDetails() 
	{
		
		return x+y+z;
	}
	
	
	void setDetails(int x,int y,int z) 
	{
		
		this.x=x;
		this.y=y;
		this.z=z;
		
		
		System.out.println("value of x is "+ x +" and value of y is "+ y+"value of z is "+z);
		
	}
		
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter x,y and z values ");
		
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		MethodOverloading m=new MethodOverloading();
		
		m.setDetails(x,y,z);
		
		System.out.println(m.getDetails());
	

	}

}
