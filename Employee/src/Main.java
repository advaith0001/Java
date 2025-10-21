
// Base class
class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

// Subclass
class SoftwareEngineer extends Employee {
    String language;

    // Constructor
    SoftwareEngineer(String name, double salary, String language) {
        super(name, salary);  // Call to parent class constructor
        this.language = language;
    }

    // Overridden method
    @Override
    void displayDetails() {
        super.displayDetails();  // Reuse base class method
        System.out.println("Programming Language: " + language);
    }
}



public class Main {

    public static void main(String[] args) {
        // Create object with constructor input
        SoftwareEngineer se = new SoftwareEngineer("Divya", 85000, "Java");

        // Display details
        System.out.println("=== Software Engineer Details ===");
        se.displayDetails();
    }
}
