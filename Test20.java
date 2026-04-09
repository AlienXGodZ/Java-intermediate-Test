//Abstract Class with Multiple Methods

abstract class Vehicle1 {

    // abstract methods
    abstract void start();
    abstract void stop();

    // normal method
    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

class Bike1 extends Vehicle1 {

    void start() {
        System.out.println("Bike starts");
    }

    void stop() {
        System.out.println("Bike stops");
    }

    public static void main(String[] args) {
        Bike1 b = new Bike1();

        b.start();
        b.stop();
        b.fuel();
    }
}