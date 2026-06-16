import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test52 {
    public static void main(String[] args) {

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("C:\\Users\\allen\\IdeaProjects\\filename.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(" ");

                int id = Integer.parseInt(data[0]);
                String name = data[1];

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);

            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}