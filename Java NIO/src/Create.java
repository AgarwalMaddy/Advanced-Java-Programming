import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Create {
    public static void main(String[] args) {
        String folderPath = "C:\\Winter Inter Semester 2\\Advanced Java Programming\\";
        String[] fileNames = {"file1.txt", "file2.pdf", "file3.docx"};

        for (String fileName : fileNames) {
            Path path = Paths.get(folderPath + fileName);
            try {
                Path createdFilePath = Files.createFile(path);
                System.out.println("Created a file at: " + createdFilePath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}