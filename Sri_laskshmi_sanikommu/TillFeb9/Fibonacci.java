import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENter a number: ");
        int n = input.nextInt();
        input.close();

        long [] f = new long[n];
        f[0] = 0;
        f[1] = 1;
        System.out.print("Fibonacci Series: "+f[0]+" "+f[1]+" ");
        for(int i = 2;i<n;i++){
            f[i] = f[i-2]+f[i-1];
            System.out.print(f[i]+" ");
        }
    }
}
