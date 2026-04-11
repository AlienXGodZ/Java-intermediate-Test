//Method Local Inner Class

class Outer2 {

    void display() {

        class Inner2 {
            void show() {
                System.out.println("Inside method local inner class");
            }
        }

        Inner2 i = new Inner2();
        i.show();
    }
}
public class Test28{

    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.display();
    }
}