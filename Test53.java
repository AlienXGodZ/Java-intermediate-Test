import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test53 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("student.txt"));

            bw.write("Name: Allen");
            bw.newLine();
            bw.write("Age: 21");
            bw.newLine();
            bw.write("Department: CSE");

            bw.close();

            System.out.println("Student data saved successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}