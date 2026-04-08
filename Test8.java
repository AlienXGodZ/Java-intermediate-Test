//Bank Account (private balance + getter/setter)

public class Test8 {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Test8 acc = new Test8();

        acc.deposit(5000);
        acc.deposit(2000);

        System.out.println("Balance: " + acc.getBalance());
    }
}