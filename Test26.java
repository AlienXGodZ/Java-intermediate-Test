//Member Inner Class

class Outer {
    String msg = "Hello from Outer";

    class Inner {
        void show() {
            System.out.println(msg);
        }
    }
}
    public class Test26 {


        public static void main(String[] args) {
            Outer o = new Outer();
            Outer.Inner i = o.new Inner(); // important syntax
            i.show();
        }
    }
