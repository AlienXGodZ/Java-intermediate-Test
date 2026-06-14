import java.util.Scanner;

public class Test32{
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.println("ENTER STUDENT NAME");
        String name = obj.nextLine();

        System.out.println("ENTER STUDENT AGE");
        int age = obj.nextInt();


        System.out.println("ENTER STUDENT MARK");
        double mark = obj.nextDouble();


        System.out.println("Student Details");
        System.out.println("STUDENT NAME:" + name);
        System.out.println("STUDENT AGE:" + age);
        System.out.println("STUDENT MARK:" + mark);

    }
}