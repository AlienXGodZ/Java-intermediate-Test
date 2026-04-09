//Abstract Class Constructor Usage

abstract class Vehicle3 {

    // constructor
    Vehicle3() {
        System.out.println("Vehicle constructor called");
    }

    abstract void start();
}

class Bike3 extends Vehicle3 {

    Bike3() {
        System.out.println("Bike constructor called");
    }

    void start() {
        System.out.println("Bike starts");
    }

    public static void main(String[] args) {

        Bike3 b = new Bike3(); // object creation

        b.start();
    }
}