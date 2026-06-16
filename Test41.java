public class Test41 {
    public static void main(String[] args) {

        String value = "abc";

        try {
            int number = Integer.parseInt(value);
            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Number Format");
        }
    }
}