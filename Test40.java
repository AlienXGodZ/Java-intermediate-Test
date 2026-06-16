import java.util.Scanner;

public class Test40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try {
            if (salary < 0) {
                throw new Exception("Invalid Salary");
            }

            System.out.println("Salary: " + salary);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}