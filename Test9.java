//Employee salary with validation

public class Test9 {

    private int salary;

    // Setter with validation
    public void setSalary(int amount) {
        if (amount > 0) {
            salary = amount;
            System.out.println("Salary set successfully.");
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Getter
    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Test9 emp = new Test9();

        emp.setSalary(25000);   // valid
        System.out.println("Employee Salary: " + emp.getSalary());

        emp.setSalary(-5000);   // invalid
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}