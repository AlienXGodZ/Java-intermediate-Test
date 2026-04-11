//Functional Interface (Single Method)

interface MyInterface {
    void show();
}

class Test {

    public static void main(String[] args) {

        MyInterface obj = new MyInterface() {
            public void show() {
                System.out.println("Functional Interface method");
            }
        };

        obj.show();
    }
}