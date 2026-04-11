interface Payment {
    void pay(); // abstract method
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
public class Test22{

    public static void main(String[] args) {
        UPI u = new UPI();
        u.pay();
    }
}