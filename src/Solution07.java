import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solution07 {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        writeTextWithBuffer(file1);
    }

    private static void writeTextWithBuffer(String file) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(file))) {
            writer.write("반갑습니다\n"); // \n : 개행문자(줄바꿈)
            writer.write("반갑습니다");
            writer.newLine(); // \n
            writer.write("JDK17+로 작업중");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
