//Interface vs abstract usage example

interface Animal6 {
    void sound();
}

abstract class Vehicle6 {
    void fuel() {
        System.out.println("Uses fuel");
    }
}

class Dog6 extends Vehicle6 implements Animal6 {

    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog6 d = new Dog6();
        d.sound();
        d.fuel();
    }
}