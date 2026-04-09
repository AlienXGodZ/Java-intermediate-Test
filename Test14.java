//Constructor inheritance using super

class Animal3 {
    String name;

    // Parent constructor
    Animal3(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

class Dog3 extends Animal3 {

    // Child constructor
    Dog3(String name) {
        super(name); // calling parent constructor
        System.out.println("Dog constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}
    public class Test14 {
        public static void main(String[] args) {
            Dog3 d = new Dog3("Tommy");
            d.display();
        }
    }
