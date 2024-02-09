package Assignmnets;

import java.util.*;
public abstract class Operations {
	
	int a,b;
	
	abstract int add();
	abstract int sub(); 
	abstract int mult();
	abstract int div();
	
	

}

class Operations1 extends Operations{

	@Override
	int add() {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int sub() {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	int mult() {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	int div() {
		// TODO Auto-generated method stub
		return a/b;
	}
	

}

class OperationsMain{
	
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		Operations1 o=new Operations1();
		
		System.out.println("Enter the variables ");
		o.a=s.nextInt();
		
		o.b=s.nextInt();
		
		o.add();
		o.sub();
		o.mult();
		o.div();
	}
}
