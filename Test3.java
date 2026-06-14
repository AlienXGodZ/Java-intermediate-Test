// this program include price like this 40,000.00
public class Test3 {
    String name;
    String brand;
    double price;

    public static void main(String[] args) {
        System.out.println("Car Details:");

        // Object 1
        Test3 car1 = new Test3();
        car1.name = "Fortuner";
        car1.brand = "Toyota";
        car1.price = 4000000;

        // Object 2
        Test3 car2 = new Test3();
        car2.name = "Thar";
        car2.brand = "Mahindra";
        car2.price = 1500000;

        // Object 3
        Test3 car3 = new Test3();
        car3.name = "Swift";
        car3.brand = "Suzuki";
        car3.price = 800000;

        System.out.println(car1.name + " " + car1.brand + " " + String.format("%,.2f", car1.price));
        System.out.println(car2.name + " " + car2.brand + " " + String.format("%,.2f",car2.price));
        System.out.println(car3.name + " " + car3.brand + " " + String.format("%,.2f",car3.price));
    }
}