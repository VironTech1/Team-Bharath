import java.io.File;

public class ListFilesInFolder {

    public static void main(String[] args) {
        
        String directoryPath = "path/to/your/directory";
        File directory = new File(directoryPath);
        File[] fileList = directory.listFiles();
        if (fileList != null) {
            System.out.println("Listing files in directory: " + directoryPath);
            for (File file : fileList) {
                
                if (file.isFile()) {
                    
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("The specified path does not denote a directory.");
        }
    }
}

