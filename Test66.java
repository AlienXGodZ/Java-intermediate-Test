import java.io.FileOutputStream;
import java.io.IOException;

public class Test66 {
    public static void main(String[] args) {
        // The text we want to write to the file
        String text = "Hello World!";

        // "try-with-resources": the stream will be closed automatically
        try (FileOutputStream output = new FileOutputStream("C:\\Users\\allen\\IdeaProjects\\filename.txt")) {

            // Write the string as a sequence of bytes to the file
            output.write(text.getBytes());

            // Confirm that the write operation succeeded
            System.out.println("Successfully wrote to file.");

        } catch (IOException e) {
            // If something goes wrong (e.g. file not accessible), show an error message
            System.out.println("Error writing file.");
            e.printStackTrace();  // Print details for debugging
        }
    }
}