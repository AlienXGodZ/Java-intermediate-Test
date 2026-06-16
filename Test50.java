import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test50 {
    public static void main(String[] args) {

        int count = -1;

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("C:\\Users\\allen\\IdeaProjects\\filename.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                String[] word = line.split(" ");
                count = count + word.length;
            }

            br.close();

            System.out.println("count: " + count);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}