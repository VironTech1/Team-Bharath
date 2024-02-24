package package1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\avudu\\OneDrive\\Desktop\\MyFile.txt"; // Change this to your file path
        String wordToSearch = "company"; // Change this to the word you want to search

        try {
            boolean exists = searchWord(filePath, wordToSearch);
            if (exists) {
                System.out.println("The word \"" + wordToSearch + "\" exists in the file.");
            } else {
                System.out.println("The word \"" + wordToSearch + "\" does not exist in the file.");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static boolean searchWord(String filePath, String word) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    return true;
                }
            }
        }
        return false;
    }
}