package javatraining;

import java.util.Scanner;

public class StorageConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size in kilobytes (KB): ");
        double kilobytes = scanner.nextDouble();

        double megabytes = kilobytes / 1024;
        double gigabytes = kilobytes / (1024 * 1024);

        System.out.printf("%.2f KB is equal to %.2f MB and %.6f GB.%n", kilobytes, megabytes, gigabytes);

        System.out.print("Enter size in gigabytes (GB): ");
        double gigabytesInput = scanner.nextDouble();

        
        double kilobytesOutput = gigabytesInput * (1024 * 1024);
        double megabytesOutput = gigabytesInput * 1024;

        System.out.printf("%.6f GB is equal to %.2f KB and %.2f MB.%n", gigabytesInput, kilobytesOutput, megabytesOutput);
    }
}
