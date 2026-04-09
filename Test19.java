//Abstract Class (Vehicle → Bike)

abstract class Vehicle {

    // abstract method (no body)
    abstract void start();

    // normal method
    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

class Bike extends Vehicle {

    // implementing abstract method
    void start() {
        System.out.println("Bike starts with kick or self");
    }

    public static void main(String[] args) {

        Bike b = new Bike();

        b.start(); // child method
        b.fuel();  // parent method
    }
}