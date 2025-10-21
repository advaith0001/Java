import java.util.Scanner;

public class Student {
    // Instance variables
    String name;
    int marks;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.marks = 0;
    }

    // Parameterized constructor (overloaded)
    public Student(String name, int marks) {
        this.name = name;         // using 'this' to differentiate instance and local variables
        this.marks = marks;
    }

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    // Overloaded display method (no parameter)
    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Overloaded display method (with prefix)
    public void displayResult(String prefix) {
        System.out.println(prefix + " Student Details");
        displayResult();
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        // Create student object using parameterized constructor
        Student student = new Student(name, marks);

        // Display results
        student.displayResult("Ranked");

        sc.close();
    }
}
