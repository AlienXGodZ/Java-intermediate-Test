public class Test15 {

    // Method 1 → add 2 integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method 2 → add 3 integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 → add 2 double values
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 integers: " + add(10, 20));
        System.out.println("Sum of 3 integers: " + add(10, 20, 30));
        System.out.println("Sum of 2 decimals: " + add(10.5, 20.5));
    }
}