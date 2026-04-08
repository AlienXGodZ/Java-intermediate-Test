//Multiple objects creation (Student details)

public class Test4 {
    String name;
    int age;
    String address;
    String fatherName;
    String motherName;

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Father Name: " + fatherName);
        System.out.println("Mother Name: " + motherName);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        System.out.println("Student Details");

        Test4 student1 = new Test4();
        student1.name = "Allen";
        student1.age = 20;
        student1.address = "180 K Kamarajar Salai";
        student1.fatherName = "Gladwin";
        student1.motherName = "Stella";

        Test4 student2 = new Test4();
        student2.name = "Harvey";
        student2.age = 22;
        student2.address = "100 K Mahapalaiyam";
        student2.fatherName = "Daveedhu";
        student2.motherName = "Florence";

        student1.display();
        student2.display();
    }
}