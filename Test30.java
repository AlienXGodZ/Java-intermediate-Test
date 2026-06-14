public class Test30 {
    String name;

    Test30(String name) {

        this.name = name;
        System.out.println("Animal constructor called");
    }
}
class creep123 extends Test30 {

    creep123(String name) {
        super(name);
        System.out.println("make sound");
    }
    void display() {
        System.out.println("Name: " + name);
    }


public static void main(String[] args){

    creep123 mydog = new creep123("ALLEN");
    mydog.display();

    }
}
