package example;
import java.util.*;

public class ReverseOfANumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int num=s.nextInt();
		int reversenum=0;
		
		while(num!=0) {
			
			int digit=num%10;
			reversenum=reversenum*10+digit;
			num/=10;
			
			
		}
		
		System.out.println(reversenum);

	}

}
