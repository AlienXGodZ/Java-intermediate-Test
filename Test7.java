//Constructor initialization (Student)
//Parameterized constructor
//this keyword usage

public class Test7 {
    String name;
    int age;
    String fatherName;
    String motherName;

    // Constructor
    public Test7(String name, int age, String fatherName, String motherName){
        this.name = name;
        this.age = age;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Father Name: " + fatherName);
        System.out.println("Mother Name: " + motherName);
    }

    public static void main(String[] args){
        System.out.println("Student Details:\n");

        Test7 student1 = new Test7("Allen", 20, "Gladwin", "Stella");

        student1.display();
    }
}