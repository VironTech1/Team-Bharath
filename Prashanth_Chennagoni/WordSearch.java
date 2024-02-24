import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the file: ");
        String filePath = scanner.nextLine(); 
        System.out.print("Enter the word to search for: ");
        String wordToFind = scanner.nextLine(); 
        searchWordInFile(filePath, wordToFind);
        scanner.close(); 
    }

    public static void searchWordInFile(String filePath, String wordToFind) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            boolean isFound = false;
            while ((line = br.readLine()) != null) {
                if (line.contains(wordToFind)) {
                    System.out.println("Word found at line " + lineNumber + ": " + line);
                    isFound = true;
                }
                lineNumber++;
            }

            if (!isFound) {
                System.out.println("Word not found in the file.");
            }

        } catch (IOException e) {
            System.err.println("An IOException was caught!");
            e.printStackTrace();
        }
    }
}
