package Sri_laskshmi_sanikommu.Files;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearch {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Team-Bharath/Sri_laskshmi_sanikommu/Files/file.txt"))) {
            String line;
            boolean wordExists = false;
            String searchWord = "existence";
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    wordExists = true;
                    break;
                }
            }
            if (wordExists) {
                System.out.println("The word \"" + searchWord + "\" exists in the file.");
            } else {
                System.out.println("The word \"" + searchWord + "\" does not exist in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
