import java.util.Scanner;

public class Test39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 0 || age > 120) {
                throw new Exception("Invalid Age");
            }

            System.out.println("Age: " + age);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}