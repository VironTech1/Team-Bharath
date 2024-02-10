import java.util.Arrays;
import java.util.Scanner;

public class CopyArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ENter the size of String");
        int n = input.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        input.close();
        int b[] = Arrays.copyOf(a, a.length);

        b = a;
        System.out.print("a: ");
        for (int c = 0; c < n; c++) {
            System.out.print(a[c] + " ");
        }
        
        System.out.print("\nb: ");
        for (int c = 0; c < n; c++) {
            System.out.print(b[c] + " ");
        }
    }
    
}
