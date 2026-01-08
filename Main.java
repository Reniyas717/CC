import java.util.Scanner;

abstract class Student {
    int roll;
    String name;
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    void calculateResult() { }
    void displayDetails() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

class EngineeringStudent extends Student {
    int marks;
    EngineeringStudent(String name, int roll, int marks) {
        super(name, roll);
        this.marks = marks;
    }
    void calculateResult() {
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

class MedicalStudent extends Student {
    int marks;
    MedicalStudent(String name, int roll, int marks) {
        super(name, roll);
        this.marks = marks;
    }
    void calculateResult() {
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new EngineeringStudent("Reni", 101, 45);
        Student s2 = new MedicalStudent("Asha", 102, 48);

        s1.displayDetails();
        s1.calculateResult();

        s2.displayDetails();
        s2.calculateResult();
    }
}
