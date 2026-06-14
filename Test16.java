//Method overriding (Animal sound())

class Test16 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog12354 extends Animal {

    // overriding method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog12354 d = new Dog12354();
        d.sound(); // calls Dog's method
    }
}