package TrainingSet3;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryFormat = convertToBinary(decimalNumber);

        System.out.println("Binary format: " + binaryFormat);
    }

    private static String convertToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder); 
            decimalNumber /= 2;
        }

        if (binary.length() == 0) {
            return "0"; 
        }

        return binary.toString();
    }
}
