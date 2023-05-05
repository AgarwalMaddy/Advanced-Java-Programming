import java.nio.file.*;
public class Exists {
    private static String DIRECTORY = "C:\\Winter Inter Semester 2\\Advanced Java Programming\\";
    public static void check(String fileName) {
        Path filePath = Paths.get(DIRECTORY, fileName);
        if (Files.exists(filePath)) {
            System.out.println("Exists");
        } else {
            System.out.println("Not exists");
        }
    }
    public static void main(String[] args) {
        check("file3.docx");
        check("file4.html");
    }
}