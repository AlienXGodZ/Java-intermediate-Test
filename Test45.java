import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Test45 {
    public static void main(String[] args){

        File myobj = new File("C:\\Users\\allen\\IdeaProjects\\filename.txt");
        try{
            Scanner myReader = new Scanner(myobj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        }catch (FileNotFoundException e){
            System.out.println("AN error occured");
            e.printStackTrace();

        }


    }
}
