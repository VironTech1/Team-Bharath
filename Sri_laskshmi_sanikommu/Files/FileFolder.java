package Sri_laskshmi_sanikommu.Files;

import java.io.File;

public class FileFolder {
    public static void main(String[] args) {
        File folder = new File("Team-Bharath/Sri_laskshmi_sanikommu/Files");

        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
