package example;
import java.util.*;

public class Add {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//
		
		    int sumoftwonumber=0;
		    int num=150;
		    while(num>0){
		        
		        int digit=num%10;
		        sumoftwonumber+=digit;
		        num=num/10;
		    }
		      System.out.println(sumoftwonumber);

		
	}

}
