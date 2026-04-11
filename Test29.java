//Anonymous Inner Class (Interface)

interface allene {
    void show();
}

public class Test29 {
    public static void main(String[] args) {

        allene t = new allene() {
            public void show() {
                System.out.println("Anonymous inner class");
            }
        };

        t.show();
    }
}