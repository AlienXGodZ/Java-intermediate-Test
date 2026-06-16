import java.io.File;

public class Test46 {
    public static void main(String[] args) {

        File myobj = new File("C:\\Users\\allen\\IdeaProjects\\filename.txt");

        if (myobj.delete()) {
            System.out.println("Deleted the file: " + myobj.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}