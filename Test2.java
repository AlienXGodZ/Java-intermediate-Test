//this program in price it automatically put comma. like 40,0000

public class Test2 {
    String name;
    String brand;
    int price;

    public static void main(String[] args) {
        System.out.println("Car Details:");

        Test2 car1 = new Test2();
        car1.name = "Fortuner";
        car1.brand = "Toyota";
        car1.price = 4000000;

        Test2 car2 = new Test2();
        car2.name = "Thar";
        car2.brand = "Mahindra";
        car2.price = 1500000;

        Test2 car3 = new Test2();
        car3.name = "Swift";
        car3.brand = "Suzuki";
        car3.price = 800000;

        System.out.println(car1.name + " " + car1.brand + " " + String.format("%,d", car1.price));
        System.out.println(car2.name + " " + car2.brand + " " + String.format("%,d", car2.price));
        System.out.println(car3.name + " " + car3.brand + " " + String.format("%,d", car3.price));
    }
}