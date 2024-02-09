package example;
import java.util.*;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();
        
        double discountedPrice =originalPrice - (originalPrice * discountPercentage / 100);
        
        System.out.println("The discounted price is: " + discountedPrice);


	}

}
