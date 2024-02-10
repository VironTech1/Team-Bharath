package example;
import java.util.*;

public class MultipleOfFive {

	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter a First number ");
	int first =s.nextInt();
	
	if(first%5==0) {
		System.out.println("multiple of 5");
	}
	else {
		System.out.println("not a multiple of 5");
	}


	}

}
