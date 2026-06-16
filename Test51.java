import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test51 {
    public static void main(String[] args) {

        String searchWord = "Java";
        boolean found = false;

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("C:\\Users\\allen\\IdeaProjects\\filename.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                if (line.contains(searchWord)) {
                    found = true;
                    break;
                }
            }

            br.close();

            if (found) {
                System.out.println("Word Found");
            } else {
                System.out.println("Word Not Found");
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}