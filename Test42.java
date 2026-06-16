import java.util.Scanner;

public class Test42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter number: ");
            int num = Integer.parseInt(sc.next());

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            int result = num / divisor;

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");

        } catch (Exception e) {
            System.out.println("Other Exception");
        }
    }
}