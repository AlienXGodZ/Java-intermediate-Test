public class Test1 {
    String name;
    String brand;
    int price;

    public static void main(String[] args) {
        System.out.println("Car Details:");

        // Object 1
        Test1 car1 = new Test1();
        car1.name = "Fortuner";
        car1.brand = "Toyota";
        car1.price = 4000000;

        // Object 2
        Test1 car2 = new Test1();
        car2.name = "Thar";
        car2.brand = "Mahindra";
        car2.price = 1500000;

        // Object 3
        Test1 car3 = new Test1();
        car3.name = "Swift";
        car3.brand = "Suzuki";
        car3.price = 800000;

        System.out.println(car1.name + " " + car1.brand + " " + car1.price);
        System.out.println(car2.name + " " + car2.brand + " " + car2.price);
        System.out.println(car3.name + " " + car3.brand + " " + car3.price);
    }
}