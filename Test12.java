//Multilevel inheritance (Animal → Dog → Puppy)

class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog1 {
    void weep() {
        System.out.println("Puppy weeps");
    }
}
public class Test12{

    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.sound(); // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}