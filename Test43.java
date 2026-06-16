import java.io.File;
import java.io.IOException;

public class Test43 {
    public static void main(String[] args){


        try {

            File file = new File("C:\\Users\\allen\\IdeaProjects\\filename.txt");

            if (file.createNewFile()) {

                System.out.println("File created" + file.getName());

                System.out.println("Absolute path:" + file.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }
        }

            catch(IOException e){
                System.out.println("An error occured");
                e.printStackTrace();
            }



        }

    }

