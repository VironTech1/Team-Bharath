import java.util.Scanner;
import java.lang.Math;;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a number: ");
        int n = input.nextInt();

        System.out.print("Prime numbers between 1 to "+n+"are: ");
        input.close();
        
        for(int i = 2;i <= n;i++){
            boolean prime = true;

            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.print(i+" ");
            }
        }
    }
}