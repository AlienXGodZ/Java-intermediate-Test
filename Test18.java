//super method call

class Animal5 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog5 extends Animal5 {

    void sound() {
        System.out.println("Dog barks");
    }

    void show() {
        super.sound(); // calling parent method
        sound();       // calling child method
    }
}
public class Test18{

    public static void main(String[] args) {
        Dog5 d = new Dog5();
        d.show();
    }
}