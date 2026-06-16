import java.io.File;

public class Test46 {
    public static void main(String[] args) {

        File myobj = new File("C:\\Users\\allen\\IdeaProjects\\filename.txt");
        try {
            if (myobj.delete()) {
                System.out.println("delete the file " + myobj.getName());
            } else {
                System.out.println("Faiiled to delelte the file");
            }

        }catch(Exception e){
            System.out.println("not deleted");
        }

    }
}
