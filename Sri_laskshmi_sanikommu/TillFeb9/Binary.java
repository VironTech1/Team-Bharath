import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        input.close();
        int i = n;
        String binary = "";
        while (i!=0) {
            int x = i%2;
            i = i/2;
            binary = x + binary;
        }
        System.out.println(binary);
    }
}
