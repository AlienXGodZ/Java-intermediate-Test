import java.io.FileWriter;
import java.io.IOException;

public class Test47 {
    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("C:\\Users\\allen\\IdeaProjects\\filename.txt",true);

            writer.write("\nHello Java");

            writer.close();

            System.out.println("Data appended successfully");

        } catch (IOException e) {

            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}