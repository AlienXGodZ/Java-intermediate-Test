//Method overriding (Animal sound())

class animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class dog extends Animal {

    // overriding method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // calls Dog's method
    }
}