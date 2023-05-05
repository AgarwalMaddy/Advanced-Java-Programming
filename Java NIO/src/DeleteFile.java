import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) {
        String folderPath = "C:\\Winter Inter Semester 2\\Advanced Java Programming\\";
        String[] fileNames = {"file1.txt", "file3.docx"};

        for (String fileName : fileNames) {
            Path path = Paths.get(folderPath + fileName);
            try {
                Files.deleteIfExists(path);
                System.out.println("Deleted file at: " + path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}