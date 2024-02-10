import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no.of digits: ");
        int base = input.nextInt();

        System.out.print("Enter a number to check: ");
        int num = input.nextInt();
        input.close();
        
        int n = num;
        double arm = 0;

        if(num <= 9){
            System.out.println("Given Number "+num+" is an Armstrong number");
        }
        while (num != 0) {
            int x = num%10;
            double y = Math.pow(x,base);
            arm = y + arm;
            num = num/10;
        }
        if(n == arm){
            System.out.println("Given Number "+n+" is an Armstrong number");
        }
        else{
            System.out.println("Given Number "+n+" is not an Armstrong number");
        }

    }
}
