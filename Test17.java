//Runtime polymorphism (parent reference)

class Animal4 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog4 extends Animal4 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat4 extends Animal4 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Test17 {
    public static void main(String[] args) {

        Animal4 a;  // parent reference

        a = new Dog4();
        a.sound();  // calls Dog method

        a = new Cat4();
        a.sound();  // calls Cat method
    }
}