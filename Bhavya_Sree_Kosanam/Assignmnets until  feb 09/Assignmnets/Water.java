package Assignmnets;

public abstract class Water {

	int watercapacity;
	int waterlevel;
	
	
	abstract void filling(int watercapacity,int waterlevel);
	abstract void sipping(int watercapacity,int waterlevle);
	abstract void emptying(int waterlevel);

}
