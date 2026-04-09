//Hierarchical inheritance (Animal → Dog, Cat)

class Animal2 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog2 extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal2 {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Test13 {
    public static void main(String[] args) {

        Dog2 d = new Dog2();
        d.sound();  // from Animal
        d.bark();// from Dog

        Cat c = new Cat();
        c.sound();  // from Animal
        c.meow();   // from Cat
    }
}