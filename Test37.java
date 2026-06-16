import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Birthday1 {
    int day;
    int month;
    int year;

    Birthday1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Test37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        Birthday myBirth = new Birthday(day, month, year);

        LocalDate birthDate =
                LocalDate.of(myBirth.year, myBirth.month, myBirth.day);

        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("Age: "
                + age.getYears() + " years "
                + age.getMonths() + " months "
                + age.getDays() + " days");
    }
}