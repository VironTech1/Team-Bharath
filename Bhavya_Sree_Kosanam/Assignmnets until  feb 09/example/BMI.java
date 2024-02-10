package example;
import java.util.*;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of weight in kilograms");
		
		double wt=s.nextDouble();
		
		System.out.println("Enter the value of height in meters");
		double ht=s.nextDouble();
		
		double BMI=(wt)/(ht*ht);
		
		System.out.println("Enter ur body mass index : "+BMI);
		

	}

}
