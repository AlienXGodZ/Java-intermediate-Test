import java.time.LocalDate;
import java.util.Scanner;

class birthday1 {
    int day;
    int month;
    int year;

    birthday1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Test36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Birthday Day:");
        int day = sc.nextInt();

        System.out.print("Enter Birthday Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Birthday Year: ");
        int year = sc.nextInt();

        birthday1 myBirth = new birthday1(day, month, year);

        LocalDate today = LocalDate.now();

        int age = today.getYear() - myBirth.year;

        if (today.getMonthValue() < myBirth.month ||
                (today.getMonthValue() == myBirth.month &&
                        today.getDayOfMonth() < myBirth.day)) {
            age--;
        }

        System.out.println("Age = " + age + " years");
    }
}