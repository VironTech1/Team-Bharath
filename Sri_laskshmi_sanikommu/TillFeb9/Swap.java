import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = {11,2,18,24,31,19};
        int b[] = Arrays.copyOf(a, a.length);

        System.out.println("Enter the indexs you want to swap: ");
        int i = input.nextInt();
        int j = input.nextInt();

        input.close();
        b[i] = a[j];
        b[j] = a[i];

        System.out.print("Swaped array: ");
        for(int k = 0; k < a.length; k++){
            System.out.print(b[k]+" ");
        }
    }
    
}
