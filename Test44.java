import java.io.FileWriter;
import java.io.IOException;

public class Test44 {
    public static void main(String[] args){

     try{
         FileWriter mywriter = new FileWriter("C:\\Users\\allen\\IdeaProjects\\filename.txt");

         mywriter.write("FIles in java might");
         mywriter.close();
         System.out.println("Successfully");
     }catch(IOException e){
         System.out.println("an error occured");
         e.printStackTrace();
     }



    }
}
