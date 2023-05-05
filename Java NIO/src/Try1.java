import java.nio.file.*;
public class Try1 {
    private static String DIRECTORY = "C:\\HIV AIDS";
    public static void check(String fileName) {
        Path filePath = Paths.get(DIRECTORY, fileName);
        if (Files.exists(filePath)) {
            System.out.println("Exists");
        } else {
            System.out.println("Not exists");
        }
    }
    public static void main(String[] args) {
        check("index.html");
        check("hiv.html");// replace "example.txt" with the name of the file you want to check
    }
}