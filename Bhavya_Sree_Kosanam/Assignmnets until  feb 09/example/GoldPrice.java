package example;
import java.util.*;
public class GoldPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enetr the gold wt");
		double goldwt=s.nextDouble();
		
		System.out.println("enetr the stone wt");
		double stonewt=s.nextDouble();
		
		System.out.println("enetr the makingchargers");
		double makingchargers=s.nextDouble();
		
		double effprice=goldwt*5250+stonewt*1500;
	     makingchargers=effprice+effprice*(makingchargers/100.00);
	     
	     System.out.println("Total price of an ornament"+makingchargers);
		
		
		
		
		

	}

}
