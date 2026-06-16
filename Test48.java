import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test48 {
    public static void main(String[] args) {

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("student.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}