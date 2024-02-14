package com;

public abstract class Mobile {

    String Brand;
    String Color;
    int Size;
    
    
public void Details()
{
	System.out.println("Enter the Brand"+Brand);
	System.out.println("Enter the Color"+Color);
	System.out.println("Enter the Size"+Size);

	}
abstract void getbalance();
abstract void makecall();
abstract void recharge();

}
class Mobile1 extends Mobile{
	@Override
	void getbalance() {
		
		System.out.println("getbalance");
		
}
	@Override
	void makecall() {
		
		System.out.println("makecall");
	}
	@Override
	void recharge() {
		
		System.out.println("recharge");
		
}

}
