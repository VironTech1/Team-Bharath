package package1;

import java.io.File;

public class File {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\avudu\\OneDrive\\Desktop\\Srinivas"; 

        File folder = new File(folderPath);
        
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                System.out.println("Files in the directory:");
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("Specified path is not a directory.");
        }
    }
}