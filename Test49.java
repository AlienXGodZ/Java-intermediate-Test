import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test49 {
    public static void main(String[] args) {

        int count = -1;

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("C:\\Users\\allen\\IdeaProjects\\filename.txt"));

            String line;

            while (br.readLine() != null) {
                count++;
            }

            br.close();

            System.out.println("Lines: " + count);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}