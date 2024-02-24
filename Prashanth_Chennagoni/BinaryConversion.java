import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binary = convertToBinary(decimalNumber);

        System.out.println("Binary representation: " + binary);

        scanner.close();
    }

    static String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }
}
