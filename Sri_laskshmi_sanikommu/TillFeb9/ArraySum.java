import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = input.nextInt();

        int a[] = new int[n];
        System.out.println("enter the values of the array");

        for(int x=0;x<n;x++){
            a[x] = input.nextInt();
        }
        input.close();
        int sum = 0;

        for(int i = 0; i<a.length; i++){
            sum = sum+a[i];
        }
        System.out.println("Sum of array is: "+sum);
    }
    
}
