package Sri_laskshmi_sanikommu.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wordcount {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Team-Bharath/Sri_laskshmi_sanikommu/Files/file.txt"))) {
            String line;
            int wordCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Number of words in the file: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
