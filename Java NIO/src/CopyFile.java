import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFolderPath = "C:\\Winter Inter Semester 2\\Advanced Java Programming\\";
        String targetFolderPath = "C:\\Winter Inter Semester 2\\";
        String[] fileNames = {"file2.pdf"};

        for (String fileName : fileNames) {
            Path sourcePath = Paths.get(sourceFolderPath + fileName);
            Path targetPath = Paths.get(targetFolderPath + fileName);
            try {
                Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Copied file from: " + sourcePath + " to: " + targetPath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}