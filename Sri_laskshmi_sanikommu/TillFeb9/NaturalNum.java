import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter no.of Natural Numbers: ");
        int n = input.nextInt();

        input.close();

        System.out.print("Natural Number: ");
        for(int i = 1; i <= n;i++){
            System.out.print(i+" ");
        }

        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum = sum+i;
        }
        System.out.println("\nSum: "+sum);

        int mul = 1;
        for(int i = 1; i<=n;i++){
            mul = mul*i;
        }
        System.out.println("\nmultiplication: "+mul);
    }
    
}
