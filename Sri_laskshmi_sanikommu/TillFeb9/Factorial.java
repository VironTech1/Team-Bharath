import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to find factorial: ");
        int n = input.nextInt();

        input.close();

        long factorial = n;
        for(int i = n-1; i > 1 ; i--){
            //System.out.println(i);
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    
}
