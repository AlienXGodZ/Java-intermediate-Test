import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Birthday {
    int day;
    int month;
    int year;

    Birthday(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Test35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        birthday1 myBirth = new birthday1(day, month, year);

        LocalDate birthDate =
                LocalDate.of(myBirth.year, myBirth.month, myBirth.day);


        LocalDate today = LocalDate.now();

        DateTimeFormatter myobj = DateTimeFormatter.ofPattern("yyyy");
        String currentyear = today.format(myobj);


        int age = Integer.parseInt(currentyear) - myBirth.year;


        System.out.println("age:" + " " + age);




    }
}