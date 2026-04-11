//Static Inner Class

class Outer1 {
    static String msg = "Hello Static";

    static class Inner1 {
        void show() {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Outer1.Inner1 i = new Outer1.Inner1(); // no outer object
        i.show();
    }
}